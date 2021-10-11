package com.venkatyarlagadda.corejava;

import java.util.Date;

public final class ImmutablePerson1 {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final Date dateOfBirth;
	
	public ImmutablePerson1(String firstName, String lastName, int age, Date dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = new Date(dateOfBirth.getTime());
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	public Date getDateOfBirth(){
		return new Date(dateOfBirth.getTime());
	}

	@Override
	public String toString() {
		return "ImmutablePerson1 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
}
