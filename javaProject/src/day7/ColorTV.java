package day7;

public class ColorTV extends TV {

	private int color;
	
//	public ColorTV(int size) {
//		super(size);
//		// TODO Auto-generated constructor stub
//	}

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty(){
		System.out.println("결과 : "+ getSize() +"인치 "+ color +"컬러");
	}
	
}
