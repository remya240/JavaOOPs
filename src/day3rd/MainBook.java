package day3rd;

import java.util.Scanner;

//Abstract class
abstract class Libraryitem {
	// Encapsulation
	private String isbn;
	private String prchasedate;
	private String author;
	private String bookTitle;

	Libraryitem(String bookTitle, String author, String prchasedate, String isbn) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.prchasedate = prchasedate;
		this.isbn = isbn;

	}

	public String getisbn() {
		return isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPrchasedate() {
		return prchasedate;
	}

	public void setPrchasedate(String prchasedate) {
		this.prchasedate = prchasedate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	// Abstraction
	abstract void displayDetails();

}

//Inheritance
class Book extends Libraryitem {
	Book(String bookTitle, String author, String prchasedate, String barcode) {
		super(bookTitle, author, prchasedate, barcode);

	}

	// Polymorphism
	@Override
	void displayDetails() {

		System.out.println("Title: " + getBookTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Purchase Date: " + getPrchasedate());
		System.out.println("ISBN: " + getisbn());
	}

}

public class MainBook {
	public static void main(String[] args) {
		// Book b = new Book("Java Programming", "John Doe", "2022-01-01",
		// "978-0-123456-78-9");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Book Title:");
		String title = scanner.nextLine();

		System.out.println("Enter Author Name:");
		String author = scanner.nextLine();

		System.out.println("Enter Publication Date (YYYY-MM-DD):");
		String date = scanner.nextLine();

		System.out.println("Enter ISBN Number:");
		String isbn = scanner.nextLine();
		Book book = new Book(title, author, date, isbn);
		book.displayDetails();
        scanner.close();

	}
}
