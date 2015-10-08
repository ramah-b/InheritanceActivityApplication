package myAssignment;

public final class Book extends Product {
	private String author;
	private int pages;

	public Book() {
		super();
		this.author = "";
		this.pages = 0;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String whoAmI() {
		return "Book";
	}

	public boolean equals(Object o) {
		Book b = (Book) o;
		if (super.equals(o) && b.getAuthor().equalsIgnoreCase(this.author)
				&& b.getPages() == (this.pages))

			return true;
		else
			return false;
	}
}