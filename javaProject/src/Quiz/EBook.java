package Quiz;

public class EBook extends Book {

	private double fileSize;
	
	public EBook() {
		this("Unknown","Unknown",0.0);
		//제목과 저자 Unknown, 파일 크기 0.0
	}
	
	public EBook(String title, String author, double fileSize) {
		super(title, author);
		this.fileSize = fileSize;
	}


	public void setTitle(String title) {
		super.setTitle(title);
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	
	public void printInfo() {
//		Good JAVA - 홍길동, 파일 크기: 3.8MB
		System.out.print(getTitle() + " - " + getAuthor() + ", ");
		System.out.println("파일크기: " + fileSize + "MB");
	};

}
