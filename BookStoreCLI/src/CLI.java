
/**
 * 
 */
/**
 * @author Sichun Zeng
 * A prototype for Book store system.
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

import main.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CLI {
	

	/*
	 * load the books so that the books, customers and bookcopies are all saved 
	 */
	private static ArrayList<Book> loadBooks(String path) {
		String booksCSV = path + "/books.csv";
		ArrayList<Book> books = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(booksCSV))) {
            String line;
            boolean isFirstLine = true; // Skip the header line if present

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(";"); // Split the line by comma
                String isbn = data[0];
                String title = data[1];
                String[] authors = data[2].split(",");
                int year = Integer.parseInt(data[3]);
                String city = data[4];
                String publisher = data[5];
                int edition = Integer.parseInt(data[6]);
                
                Book book = new Book(isbn,title,authors,year,city,publisher,edition);

                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		return books;
	}
	
	/*
	 * load the data of bookcopies
	 */
	private static ArrayList<BookCopy> loadBookCopies(String path) {
		String bookCopiesCSV = path + "/bookcopies.csv";
		ArrayList<BookCopy> bookCopies = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(bookCopiesCSV))) {
            String line;
            boolean isFirstLine = true; // Skip the header line if present

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(";"); // Split the line by comma
                Long id = Long.parseLong(data[0]);
                String bookIsbn = data[1];
                String shelfLocation= data[2];
                String addedToLibrary = data[3];
                boolean lent = Boolean.parseBoolean(data[4]);
                String lentDate = data[5];
              
                
                BookCopy bookCopy = new BookCopy(id,bookIsbn,shelfLocation,addedToLibrary,lent,lentDate);

                bookCopies.add(bookCopy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		return bookCopies;
	}
	
	/*
	 * load the data of customers
	 */
	private static ArrayList<Customer> loadCustomer(String path) {
		String customersCSV = path + "/customers.csv";
		ArrayList<Customer> customers = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(customersCSV))) {
            String line;
            boolean isFirstLine = true; // Skip the header line if present

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(";"); // Split the line by comma
                long id =Long.parseLong(data[0]);
                String name = data[1];
                String firstName = data[2];
                String address = data[3];
                String zipCode = data[4];
                String city = data[5];
                boolean feesPayed = Boolean.parseBoolean(data[6]);
              
                
                Customer customer = new Customer(id,name,firstName,address,zipCode,city,feesPayed);

                customers.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		return customers;
	}
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		String path = projectPath + "/src/resources";
		ArrayList<Book> books = CLI.loadBooks(path);
		ArrayList<BookCopy> bookCopies = CLI.loadBookCopies(path);
		ArrayList<Customer> customers = CLI.loadCustomer(path);
		for(Customer customer:customers) {
			System.out.println(customer.getFeesPayed());
		}

		
		
		
		
		Scanner scanner = new Scanner(System.in);
		String option = "";
		System.out.println("Welcome to the Book Store System !");
		System.out.println("Please type an option");
		System.out.println("borrow: borrow books");
		System.out.println("return: return books");
		System.out.println("exit:exit the system");

		option = scanner.nextLine();

		// choose exit to exit the system
		while (true) {
			switch (option) {
			case "borrow":
				System.out.println("Please enter the book name");
				String bookName = scanner.nextLine();
				if (!bookName.equals("Harry Potter")) {
					System.out.println("Sorry, we don't have the book now, we will get it soon");
					System.out.println("Please type an option");
					option = scanner.nextLine();
					break;
				} else {
					System.out.println("The book is on Shelf 52, first floor");
					System.out.println("Please type an option");
					option = scanner.nextLine();
					break;
				}
			case "return":
				System.out.println("Please take your book to the staff and type exit");
				System.out.println("Please type an option");
				option = scanner.nextLine();
				break;

			case "exit":
				System.out.println("Thanks for your visiting, bye.");
				System.exit(0);
			default:
				System.out.println("Please type a valid option");
				option = scanner.nextLine();
				break;
			}
		}

	}
}