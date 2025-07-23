package day6;

public class ReviewMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_Review hong = new Human_Review("홍길동", 30, 170.1);
		hong.intro();
		String name = hong.getName();
//		System.out.println(hong.getName());
		System.out.println("============");
		
		Human_Review kim = new Human_Review("김철수", 25, 181.1);
		kim.intro();
	}

}
