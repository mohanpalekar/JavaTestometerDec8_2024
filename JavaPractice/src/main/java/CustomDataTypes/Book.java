package CustomDataTypes;

import java.time.LocalDate;

public class Book {

	/*
	 * author - String
	 * name - String
	 * publishedDate - DateTime
	 * price - Float
	 */

	private String name;

	private String author;

	private LocalDate publishedDate;

	private float price;

	public Book(String name, String author, LocalDate publishedDate, float price) {
		super();
		this.name = name;
		this.author = author;
		this.publishedDate = publishedDate;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publishedDate=" + publishedDate + ", price=" + price
				+ "]";
	}




}
