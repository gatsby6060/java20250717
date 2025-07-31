package Quiz;

public class Laptop extends Computer {

	private double weight;
	
	public Laptop(String brand) {
		super(brand);
	}

	public Laptop(String brand, double weight) {
		super(brand);
		this.weight = weight;
	}

	public void printSpecs(){
		System.out.println(super.getBrand()+"브랜드의 "+this.weight+"kg 노트북");
	}

	public double getWeight() {
		return weight;
	}
	
	
	
}
