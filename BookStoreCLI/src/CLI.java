
/**
 * 
 */
/**
 * @author Sichun Zeng
 * A prototype for Book store system.
 *
 */
import java.util.Scanner;

public class CLI {
	public static void main(String[] args) {
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