package com.venkatyarlagadda.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

public class Dates {

	public static void main(String[] args) {
		Dates dd = new Dates();
		ZoneId localZoneId = ZonedDateTime.now().getZone();
		System.out.println("Local Zone Id:\t" + localZoneId);
		ZonedDateTime zonedDateTime = dd.getCurrentLocalZonedDateTime();
		ZonedDateTime utcTime = dd.changeToUTC(zonedDateTime);
		ZonedDateTime convertedUtcToLocal = dd.convertUtcToLocalZone(utcTime, localZoneId);

		System.out.println("Local Zoned Date Time:\t\t\t\t\t" + zonedDateTime);
		System.out.println("To Local Date Time:\t" + zonedDateTime.toLocalDateTime());
		System.out.println("To Instant:\t" + zonedDateTime.toInstant());
		System.out.println("Convert Local to UTC:\t" + utcTime);
		System.out.println("Convert UTC To Local:\t" + convertedUtcToLocal);
		System.out.println("Start of Day:\t" + dd.getStartOfDay(zonedDateTime));
		System.out.println("EOD of Day:\t" + dd.getEndOfDay(zonedDateTime));
		System.out.println("Convert Start of Day to UTC:\t" + dd.changeToUTC(dd.getStartOfDay(zonedDateTime)));
		System.out.println("Convert Local of Day to UTC:\t" + dd.changeToUTC(dd.getEndOfDay(zonedDateTime)));
		

		System.out.println("----------------------------");
		Instant instant1 = Instant.now();
		
		System.out.println("Instant Now:\t" + instant1);
		System.out.println("To Local Date Time:\t" + zonedDateTime.toLocalDateTime());
		System.out.println("Convert Local to UTC:\t" + utcTime);
		
		System.out.println("EOD To instant:\t"+ dd.getEndOfDay(zonedDateTime).toInstant());
	}

	private ZonedDateTime convertUtcToLocalZone(ZonedDateTime zonedDateTime, final ZoneId localZoneId) {
		return zonedDateTime.withZoneSameInstant(localZoneId);
	}

	public ZonedDateTime getCurrentLocalZonedDateTime() {
		return ZonedDateTime.now();
	}

	public ZonedDateTime getStartOfDay(final ZonedDateTime zonedDateTime) {
		return ZonedDateTime.of(zonedDateTime.toLocalDate().atStartOfDay(), zonedDateTime.getZone());
	}

	public ZonedDateTime getEndOfDay(final ZonedDateTime zonedDateTime) {
		return ZonedDateTime.of(zonedDateTime.plusDays(1).toLocalDate().atStartOfDay(), zonedDateTime.getZone())
				.plusMinutes(-1);
	}

	public ZonedDateTime changeToUTC(final ZonedDateTime zonedDateTime) {
		return zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
	}
}