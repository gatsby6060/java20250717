package Quiz;

public class Book {
	private String title;
	private String author;

	public Book(){};
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}

	protected String getTitle() {
		return title;
	}

	protected String getAuthor() {
		return author;
	}
}
