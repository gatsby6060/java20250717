package day7;

public class Fruit_Review1 {
	private String name;
	private int price;

	Fruit_Review1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void sell(int x) {
		System.out.println(x + "개를 판매했습니다.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		String status = "A"; // 임의로 권한 값 지정 로그인한 사용자의 임의로 권한 값 지정
								// A는 관리자, M은 매니저, C는 일반사용자

		if (status.equals("A")) {
			if (p <= 0) {
				System.out.println("가격이 0원이하입니다. 다시 확인해주세요.");
			} else {
				this.price = p;
				System.out.println("가격이 수정되었습니다.");
			}
		} else {
			System.out.println("가격 수정 권한이 없습니다.");
		}

	}
}
