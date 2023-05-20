/**
 * 
 */
package main;

import java.util.Date;

/**
 * @author dwen-dwen
 *
 */
public class BookCopy {
	private long id;
	private Book book;
	private String shelfLocation;
	private Date addedToLibrary;
	private boolean lent;
	private Date lentDate;
	
	//constructor
	public BookCopy(long id, Book book, String shelfLocation, Date addedToLibrary) {
		this.id = id;
		this.book = book;
		this.setShelfLocation(shelfLocation); 
		this.addedToLibrary = addedToLibrary;
		this.setLent(false);
		this.setLentDate(null);
	}

	public String getShelfLocation() {
		return shelfLocation;
	}

	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}

	public long getId() {
		return id;
	}

	public Book getBook() {
		return book;
	}

	public Date getAddedToLibrary() {
		return addedToLibrary;
	}

	public boolean isLent() {
		return lent;
	}

	public void setLent(boolean lent) {
		this.lent = lent;
	}

	public Date getLentDate() {
		return lentDate;
	}

	public void setLentDate(Date lentDate) {
		this.lentDate = lentDate;
	}
	
	

}
