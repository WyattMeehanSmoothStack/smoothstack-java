/**
 * 
 */
package com.ss.jb.five;

import java.time.ZoneId;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * 
 * 
 * @author Wyatt Meehan
 */
public class DateTimeAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//getZoneIds();                     //Method for printing all zone ids
		LocalDate date = LocalDate.now();
		previousThursday(date);
		zoneId();
		intantToZonedDate();
		zonedToInstant();
		
	}
	public static void getZoneIds() {
		Set<String> zoneIds= ZoneId.getAvailableZoneIds();
		for (String zone : zoneIds) {
		    System.out.println(zone);
		}
	}
	
	public static void previousThursday(LocalDate date) {
		System.out.printf("The previous Thursday was: %s%n",
		          date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)) + "\n");
	}
	
	public static void zoneId() {
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println("Time in zone Asia/Kolkata: " + id1);  
	    System.out.println("Time in zone Asia/Tokyo: " + id2 + "\n");  
	}
	
	public static void intantToZonedDate() {
		Instant inst = Instant.now();
		ZonedDateTime athensTime = inst.atZone(ZoneId.of("Europe/Athens"));	
		System.out.println("Instant time is: " + inst);
		System.out.println("ZonedDateTime for Athens: " + athensTime);
		System.out.println("Difference: " + athensTime.getOffset() + "\n");	
	}
	
	public static void zonedToInstant() {
        LocalDateTime dateTime = LocalDateTime.of(2018, Month.MAY, 7, 1, 52, 12);
        ZonedDateTime athensTime = dateTime.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime : " + athensTime);
        Instant instant = athensTime.toInstant();
        System.out.println("Instant : " + instant);
	}
    
}
