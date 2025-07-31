package review_day3;

public class Employee {
	private int empId;
	private String empName;
	private String department;
	private int salary;
	private String position;
	
	public Employee(int empId, String empName){
		this(empId, empName, "");
	}
	
	public Employee(int empId, String empName, String department){
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public void setDetails(int salary, String position){
		this.salary = salary;
		this.position = position;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void empInfo() { 
//		System.out.println(empName+"사원의 사번은 "+ empId+", 직급은 "+ position
//				+ ", 급여는 "+ salary +"원 입니다.");
		System.out.print(empName);
		System.out.print(" 사원이 사번은 ");
		System.out.print(empId);
		System.out.print(", 직급은 ");
		System.out.print(position);
		System.out.print(", 급여는 ");
		System.out.print(salary);
		System.out.println("원 입니다.");
	}
	
	
	
	
	
	
	

	
	
}
