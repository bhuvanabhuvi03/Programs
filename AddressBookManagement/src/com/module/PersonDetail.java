package com.module;

public class PersonDetail {

	
	private String firstName;
	private String lastName;
	public PersonAddressDetail personaddress;
	
	public PersonAddressDetail getPersonaddress() {
		return personaddress;
	}
	public void setPersonaddress(PersonAddressDetail personaddress) {
		this.personaddress = personaddress;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "PersonDetail [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + personaddress
				+ "]";
	}
	
}
