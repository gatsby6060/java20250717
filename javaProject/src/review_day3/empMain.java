package review_day3;

public class empMain {
	
	public static void main(String[] args) {
		Employee kim = new Employee( 1001, "김철수");
		Employee park = new Employee( 2002, "박영희","인사부");
		kim.setDetails(3000000, "대리");
		System.out.println("김철수 급여 : " + kim.getSalary());
		park.empInfo();
		kim.empInfo();
	}
	
}
