package hometest250728;
// 조건 5. 메인 메소드에서 다음을 수행
// Book 객체 b1 생성 (제목: "자바의 정석", 저자: "남궁성")
// Book 객체 b2 생성 (제목: "이펙티브 자바", 저자: "조슈아 블로크", 출판사: "인사이트", 가격: 38000)
// b1의 가격을 25000으로 설정
// b2의 도서 제목을 출력
// b1의 정보 출력 (printInfo() 호출)
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("자바의 정석", "남궁성");
		Book b2 = new Book("이펙티브 자바", "조슈아 블로크", "인사이트", 38000);
		
		b1.setPrice(25000);
		System.out.println("b2의 도서 제목 : "+ b2.getTitle());
		System.out.println("b1의 정보출력");
		b2.printInfo();
	}

}
