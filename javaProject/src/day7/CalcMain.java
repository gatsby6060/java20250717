package day7;

//2-1. 아래 조건에 맞게 클래스를 작성하시오.
//- 클래스명 : Calc
//- 메소드 : sum, multiple
//- 위 메소드 들은 객체 생성없이 클래스명으로 호출가능하도록
//- 위에서 정의한 메소드는 각각 2개의 정수를 받아서 덧셈, 곱셈 결과를 리턴
//
//2-2. 해당 클래스의 multiple 메소드를 아래조건에 맞게 수정하시오.
//- 오버로딩하여 3개의 메소드로 만들기(매개변수 수정은 자유롭게)
//2-3. main이 포함된 클래스를 생성하고 main 메소드 내에 아래 조건에 맞게 작성하시오.
//- Calc클래스의 메소드를 호출하시오(sum 1개, multiple 3개)
public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mainSum = Calc.sum(1, 2);
		System.out.println("mainSum " + mainSum);

		int mainMultiple2 = Calc.multiple(1, 2);
		System.out.println("mainMultiple 변수2개 " + mainMultiple2);

		int mainMultiple3 = Calc.multiple(1, 2, 3);
		System.out.println("mainMultiple 변수3개 " + mainMultiple3);

		System.out.println(Calc.multiple(1.3, 4));
		System.out.println(Calc.multiple(2, 3, 2));
	}

}
