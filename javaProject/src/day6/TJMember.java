package day6;

public class TJMember {

	String name;
	int age;
	String stuNo; //20251212
	int money;
	static int classMoney; //회비   (이건 초기화 되면 안됨)
	
	TJMember(String name, int age, String stuNo, int money){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
		this.money = money;
	}
	
	static void test() {
		System.out.println("static 테스트");
	}
	
}
