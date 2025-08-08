package review_final;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// % 나머지연산 많이쓰임
		// and , or
		int a = 10;
		int b = 3;
		String str = "홍길동";
		String str2 = new String("홍길동");
		
		// and(&&)는 둘다 true일 때만 true, 나머지는 false
		System.out.println(a>b && str.equals("홍길동"));
		
		// or(||) 하나라도 true이면 결과가 true
		System.out.println(a<b || str.equals(str2));
		
		System.out.println((double)a/b);
	}

}
