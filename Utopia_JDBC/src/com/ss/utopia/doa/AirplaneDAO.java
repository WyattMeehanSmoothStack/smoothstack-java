/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Airplane;

/**
 * @author Wyatt Meehan
 *
 */
public class AirplaneDAO extends BaseDAO<Airplane> {

	/**
	 * @param conn
	 */
	public AirplaneDAO(Connection conn) {
		super(conn);
	}
	
	public void addAirplane(Airplane ap) throws ClassNotFoundException, SQLException {
		save("insert into airplane (id, type_id) values (?, ?)", 
				new Object[] {ap.getId(), ap.getType().getId()});
	}
	
	public void updateAirplane(Airplane ap) throws ClassNotFoundException, SQLException {
		save("update airplane set type_id = ? where id = ?",
				new Object[] {ap.getType().getId(), ap.getId()});
	}
	
	public void deleteAirplane(Airplane ap) throws ClassNotFoundException, SQLException {
		save("delete from airplane where id = ?", new Object[] {ap.getId()});
	}
	

	@Override
	public List<Airplane> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		List<Airplane> airplanes = new ArrayList<>();
		AirplaneTypeDAO aT = new AirplaneTypeDAO(conn);
		while(rs.next()) {
			Airplane ap = new Airplane();
			ap.setId(rs.getInt("id"));
			ap.setTypeId(aT.readAirplaneTypeId(rs.getType()));
		}
		return airplanes;
	}

}
