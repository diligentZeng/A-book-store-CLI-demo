package main;

import java.util.ArrayList;

public class Book {
	
	//attributes of the book
	private String isbn;
	private String title;
	private ArrayList<String> authors;
	private int year;
	private String city;
	private String publisher;
	private int edition;
	
	//constructor
	public Book(String isbn, String title, ArrayList<String> authors,int year, String city, String publisher, int edition) {
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.year = year;
		this.city =city;
		this.publisher = publisher;
		this.edition = edition;
		
		
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public int getYear() {
		return year;
	}

	public String getCity() {
		return city;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getEdition() {
		return edition;
	}
	

}
