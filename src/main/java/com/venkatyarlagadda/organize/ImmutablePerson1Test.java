package com.venkatyarlagadda.organize;

import java.util.Calendar;

public class ImmutablePerson1Test {
	public static void main(String[] args){
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1987, Calendar.APRIL, 10);
		
		ImmutablePerson1 person1 = new ImmutablePerson1("Venkat", "Yarlagadda",30, dateOfBirth.getTime());
		
		System.out.println(person1.toString());
		
		dateOfBirth.set(1988,Calendar.DECEMBER, 14);
		person1.getDateOfBirth().setTime(dateOfBirth.getTimeInMillis());
		
		System.out.println(person1.toString());
	}
}
