package Quiz;

public class GamingLaptop extends Laptop {

//	private String graphic; 
	String  graphic;
	
	public GamingLaptop(String brand, double weight, String graphic) {
		// TODO Auto-generated constructor stub
		super(brand, weight);
		this.graphic =graphic;
	}
	
	@Override
	public void printSpecs(){
		System.out.print(super.getBrand()+"브랜드의 "+super.getWeight()+"kg ");
		System.out.println(this.graphic +" 게이밍 노트북");
				
	}
}
