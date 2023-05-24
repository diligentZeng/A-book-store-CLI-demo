package main;

import java.util.ArrayList;

public class Customer {
	//Attributes of the class customer 
	private long id;
	private String name;
	private String firstName;
	private String address;
	private String zipCode;
	private String city;
	private boolean feesPayed;
	private ArrayList<BookCopy> bookCopies;
	
	//Constructor
	public Customer(long id, String name, String firstName,String address, String zipCode, String city, boolean feesPayed ) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.setZipCode(zipCode);
		this.address = address;
		this.setCity(city);
		this.feesPayed = feesPayed;
		this.bookCopies = new ArrayList<>();	
	}
	
	public String getName(){
		return name + firstName;
	}
	
	//set status of feesPayed
	public void setFeesPayed(boolean feesPayed) {
		this.feesPayed = feesPayed;
	}
	
	// get status of feesPayed
	public boolean getFeesPayed() {
		return feesPayed;
	}
	
	// add bookcopy 
	public void addBookCopy(BookCopy bookCopy) {
		this.bookCopies.add(bookCopy);
	}
	
	//remove bookcopy
	public void removeBookCopy(BookCopy bookCopy) {
		this.bookCopies.remove(bookCopy);
	}
	
	//get book copies
	public ArrayList<BookCopy> getBookCopy(){
		return this.bookCopies;
	}

	public long getId() {
		return this.id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
