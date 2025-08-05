package day14;

public class DeBugEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 30;
		a = a + b;
		b++;
		int c = a * b;
//		int djklfjadjlajdfdjfakjdfdak =1;
		if (a > 5) {
			System.out.println("실행!");
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		
		
		
		try {
			
		} catch (Exception e) { //이렇게하면 모든 예외 처리 가능
			                    //다만 object남발하지 말듯이 어떤 에러는지 확실히 알수가 없음
			// TODO: handle exception
		}
		
		
		
	}

}
