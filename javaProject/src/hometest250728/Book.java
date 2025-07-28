package hometest250728;

//조건 1. 클래스명 : Book
//조건 2. 필드(변수)
//- title (제목, String)
//- author (저자, String)
//- publisher (출판사, String)
//- price (가격, int)
//조건 3. 생성자
//제목과 저자를 초기화하는 생성자
//제목, 저자, 출판사, 가격을 모두 초기화하는 생성자
public class Book {
	private String title;
	private String author;
	private String pubisher;
	private int price;

	Book(String title, String author){
		this(title, author, "", 0);
	}
	
	Book(String title, String author, String pubisher, int price) {
		this.title = title;
		this.author = author;
		this.pubisher = pubisher;
		this.price = price;
	}

	// 조건 4. 메소드
	// - setPrice(int price)
	// 전달받은 가격으로 price 필드 값을 변경
	//
	// - getTitle()
	// 책 제목 반환
	//
	// - printInfo()
	// 형식: "도서명: ooo / 저자: ooo / 출판사: ooo / 가격: ooo원" 출력

	public String getTitle() {
		return title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void printInfo() {
		System.out.println("도서명:" + title + " / 저자:" + author + " / 출판사:" + pubisher + " / 가격:" + price);
	}

	// 조건 5. 메인 메소드에서 다음을 수행
	// Book 객체 b1 생성 (제목: "자바의 정석", 저자: "남궁성")
	// Book 객체 b2 생성 (제목: "이펙티브 자바", 저자: "조슈아 블로크", 출판사: "인사이트", 가격: 38000)
	// b1의 가격을 25000으로 설정
	// b2의 도서 제목을 출력
	// b1의 정보 출력 (printInfo() 호출)

}
