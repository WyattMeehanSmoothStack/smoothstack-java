/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.AirplaneType;

/**
 * @author Wyatt Meehan
 *
 */
public class AirplaneTypeDAO extends BaseDAO<AirplaneType> {

	/**
	 * @param conn
	 */
	public AirplaneTypeDAO(Connection conn) {
		super(conn);
	}

	public void addAirplaneType(AirplaneType aType) throws ClassNotFoundException, SQLException {
		save("insert into airplane_type (id, max_capacity) values (?, ?)",
				new Object[] { aType.getId(), aType.getMaxCapacity() });
	}

	public void updateAirplaneType(AirplaneType aType) throws ClassNotFoundException, SQLException {
		save("update airplane_type set max_capacity = ? where id = ?",
				new Object[] { aType.getMaxCapacity(), aType.getId() });
	}

	public void deleteAirplaneType(AirplaneType aType) throws ClassNotFoundException, SQLException {
		save("delete from airport where id = ?", new Object[] { aType.getId() });
	}
	
	public List<AirplaneType> readAllATypes() throws ClassNotFoundException, SQLException {
		return read("select * from airport", null);
	}
	
	public AirplaneType readAirplaneTypeId(Integer code) throws ClassNotFoundException, SQLException {
		List<AirplaneType> aTypes = read("select * from airplane_type where = ?", 
				new Object[] {code});
		if (aTypes.size() < 1) {
			return null;
		}
		return aTypes.get(0);
	}

	@Override
	public List<AirplaneType> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		List<AirplaneType> aTypes = new ArrayList<>();
		while (rs.next()) {
			AirplaneType aT = new AirplaneType();
			aT.setId(rs.getInt("id"));
			aT.setMaxCapacity(rs.getInt("max_capacity"));
			aTypes.add(aT);
		}
		return aTypes;
	}

}
