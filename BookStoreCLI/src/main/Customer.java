package main;

import java.util.ArrayList;

public class Customer {
	//Attributes of the class customer 
	private long id;
	private String name;
	private String firstName;
	private String zipCode;
	private String city;
	private boolean feesPayed;
	private ArrayList<BookCopy> bookCopies;
	
	//Constructor
	public Customer(long id, String name, String firstName, String zipCode, String city) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.zipCode = zipCode;
		this.city = city;
		// fees are initially paided
		this.feesPayed = true;
		this.bookCopies = new ArrayList<>();	
	}
	
	public String getNameById(){
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

}
