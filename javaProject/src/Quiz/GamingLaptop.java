package Quiz;

public class GamingLaptop extends Laptop {


	private String graphicsCard; 

	public GamingLaptop(String brand, double weight, String graphicsCard) {
		// TODO Auto-generated constructor stub
		super(brand, weight);
		this.graphicsCard =graphicsCard;
	}
	
	public void printSpecs(){
		System.out.println(super.getBrand()+"브랜드의 "+super.getWeight()+"kg " 
					+ this.graphicsCard +"게이밍 노트북");
	}
}
