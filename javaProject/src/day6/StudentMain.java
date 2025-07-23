package day6;

public class StudentMain {
//	조건 1. 클래스명 : Student
	// 조건 2. 필드(변수) : stuNo(학번, int)
//						stuName(이름, String)
//						stuDept(학과, String)
//						age(나이, int)
//						gender(성별, String)
	//
//	 조건 3. 생성자 : 1. 학번, 이름 초기화 하는 생성자
//				    2. 학번, 이름, 학과 초기화 하는 생성자
//					
//	 조건 4. 메소드 : 1. setInfo
//				 (나이와 성별을 입력받아서(파라미터) age, gender에 저장, 리턴 x)
//				  2. getAge
//				  (호출 시 객체의 나이(age) 값 리턴)
//				  3. stuInfo
//				  (호출 시 'ooo(이름) 학생의 학번은 oooo(학번), 나이는 oo(나이) 입니다.' 출력
//				  
//	 조건 5. 메인 메소드에서 해당 클래스를 이용하여 객체 생성 및 호출
//	            1. 객체명 : hong, 이름 : 홍길동, 학번 : 1234
//	            2. 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
//	            3. hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
//	            4. hong 객체에서 getAge 호출 후 해당 값 출력
//				5. yu 객체에서 stuInfo 메소드 호출 결과 화면에 출력​

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student hong = new Student(1234, "홍길동");
		Student yu = new Student(1357, "유재석", "컴퓨터학과");
		hong.setInfo(20, "남");
		int age = hong.getAge();
		System.out.println("메인으로 넘어온 age값 : " + age);

		yu.stuInfo();

	}

}
