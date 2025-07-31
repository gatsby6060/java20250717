package review_day3;

public class Student extends Person { // 생성자

	private int stuNo;

	public Student(String name, int age, String addr, int stuNo) {
		super(name, age, addr); //부모의 생성자 호출가능
		this.stuNo = stuNo;
//		this.name = name; // 부모가 private이라서 안됨 ㅠㅠ
	}

	public void study() {
		System.out.println("공부를 한다.");
	}

}
