package day6;

public class Student {
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;

	Student(int stuNo, String stuName) {
		this(stuNo, stuName, "");
//		this.stuNo = stuNo;
//		this.stuName = stuName;
	}

	Student(int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}

	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	int getAge() {
		return age;
	}

	void stuInfo() {
		System.out.println(stuName + " 학생의 학번은 " + stuNo + " 나이는 " + age + " 입니다.");
	}

//	int stuNo;
//	String stuName;
//	String stuDept;
//	int age;
//	String gender;
//
//	Student(int stuNo, String stuName) {
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//	}
//
//	Student(String stuName, int stuNo) {
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//	}
//
//	Student(int stuNo, String stuName, String stuDept) {
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//		this.stuDept = stuDept;
//	}
//
//	Student(String stuName, int stuNo, String stuDept) {
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//		this.stuDept = stuDept;
//	}
//
//	void setInfo(int age, String gender) {
//		this.age = age;
//		this.gender = gender;
//	}
//
//	int getAge() {
//		System.out.println("Student클래스 내부 age는 " + age);
//		return age;
//	}
//
//	void stuInfo() {
//		System.out.println(stuName + " 학생의 학번은 " + stuNo + " 나이는 " + age + " 입니다.");
//	}

}
