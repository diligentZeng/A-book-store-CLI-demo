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
	private String bookIsbn;
	private String shelfLocation;
	private String addedToLibrary;
	private boolean lent;
	private String lentDate;
	
	//constructor
	public BookCopy(long id, String bookIsbn, String shelfLocation, String addedToLibrary,boolean lent, String lentDate) {
		this.id = id;
		this.bookIsbn = bookIsbn;
		this.setShelfLocation(shelfLocation); 
		this.addedToLibrary = addedToLibrary;
		this.setLent(lent);
		this.setLentDate(lentDate);
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

	public String getBook() {
		return bookIsbn;
	}

	public String getAddedToLibrary() {
		return addedToLibrary;
	}

	public boolean isLent() {
		return lent;
	}

	public void setLent(boolean lent) {
		this.lent = lent;
	}

	public String getLentDate() {
		return lentDate;
	}

	public void setLentDate(String lentDate) {
		this.lentDate = lentDate;
	}
	
	

}
