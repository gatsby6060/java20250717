package review_final;

public class Review5 {
	
	
//	public boolean truFal(Student st1, Student st2) {
//		
//		if(st1.getName().equals(st2.getName())){
//			System.out.println("이름 같음");
//			System.out.println("아몰라 같음사람");
//			return true;
//		}else {
//			return false;
//		}
//		
//		
//	}
	

	public static void main(String[] args) {
		Person hong = new Person("홍길동", 30, 170.5);
		hong.eat();
		Student kim = new Student("김철수", 25, 180.3, 1234);
		kim.eat();
		
		Person p[] = new Person[3];
		p[0] = hong;
		p[1] = kim;
		
		Student s[] = new Student[3];
		s[0] = kim;
//		s[1] = (Student) hong; //애초에 부모클래스로 만들어지면 자식클래스로 변환 해도 못들어간다.
		
		Student kim2 = new Student("김철수", 25, 180.3, 1234);
//		System.out.println(kim == kim2);
		
		// 그럴리 없겠지만
		// 이름, 나이, 키가 모두 동일하다면 같은 사람으로 인정하는 코드 작성
		// Student클래스에 equals메소드를 오버라이딩 해서 구현
		System.out.println(kim.equals(kim2)); //true나오도록...
		
		
		
		
	}

}
