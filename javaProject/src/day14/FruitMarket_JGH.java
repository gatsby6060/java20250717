package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket_JGH {

	
	public static int checkNumber(String msg) { // 메시지가 가격일때 는 100단위도 검증?
		Scanner s = new Scanner(System.in);
		int input;
		while(true) {
			System.out.println(msg + " : ");
			input = s.nextInt();
			
			//가격 100단위 인지 체크 하는 조건문
			if(msg.equals("가격")) {
				if(input % 100 != 0) {
					System.out.println("가격은 100단위로 입력해주세요 : ");
					continue;
				}
			}
			
			if(input <= 0) {
				System.out.println("음수는 불가능합니다. 다시 입력해주세요.");
			}else {
				break;
			}
		}
		
		return input;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * 과일가게 프로그램 *
		// 메뉴 1(추가). 과일명, 가격, 개수 추가(map)한 후 list에 담기
		// 메뉴 2(확인). 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 3(판매). 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		// 'oo개가 판매되었습니다.' 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 -1(종료). '종료되었습니다' 출력 후 프로그램 종료

//		스케너 리스트 맵 제네릭 

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("===== 과일가게 프로그램 =====");

		while (true) {
			System.out.println();
			System.out.print("[  (1) 추가  (2)확인  (3) 판매  (4)가격변경  (-1)종료  ] : ");
			int menu = s.nextInt();

			if (menu == 1) {

				HashMap<String, Object> fruit = new HashMap<>();
				System.out.print("과일명 : ");
				String fruitName = s.next();
				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					if (fruitName.equals(list.get(i).get("fruitName"))) {
						System.out.println("이미 같은 이름의 과일이 있습니다.");
						System.out.println("개수만 추가 하겠습니다.");
						System.out.print("개수 : ");
						int count = s.nextInt();
						if (count < 0) {
							System.out.println("음수입력 불가");
							break;
						}
						list.get(i).put("count", count + (int) (list.get(i).get("count")));
						System.out.println("개수 추가완료!");
						flg = true;
					}

				}
				if (!flg) {
					flg = false;
					fruit.put("fruitName", fruitName);

					System.out.print("가격 : ");
					int price = s.nextInt();
//					fruit.put("price", checkNumber("가격")) ;
					if (price < 0) {
						System.out.println("음수입력 불가");
						continue;
					} else if (price % 100 > 0.000001) {
						System.out.println("가격은 100원단위 입니다. 다시 입력");
						continue;
					}
					fruit.put("price", price);

					System.out.print("개수 : ");
					int count = s.nextInt();
//					fruit.put("count", checkNumber("개수")) ;
					if (count < 0) {
						System.out.println("음수입력 불가");
						continue;
					}
					fruit.put("count", count);

					list.add(fruit);
				}

			} else if (menu == 2) {

				System.out.print("검색할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					// list.get(i) => HashMap으로 만든 map;
//					if(list.get(i).get("fruitName").equals(fruitName)) {
					if (fruitName.equals(list.get(i).get("fruitName"))) {// 이렇게 해도 상관없음 (이경우는)
						searchFlg = true;
						System.out.print("가격 : " + list.get(i).get("price") + "원, ");
						System.out.println("갯수 : " + list.get(i).get("count") + "개");
					}
				}
				if (!searchFlg) { // search == false
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			} else if (menu == 3) {

				System.out.print("판매할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					// list.get(i) => HashMap으로 만든 map;
					if (fruitName.equals(list.get(i).get("fruitName"))) {// 이렇게 해도 상관없음 (이경우는)
						searchFlg = true;
						System.out.print("판매할 개수 : ");
//						fruit.put("count", checkNumber("개수")) ;
						int sellCount = s.nextInt();
						if ((int) list.get(i).get("count") - sellCount < 0) {
							System.out.println("판매 가능한 개수는 " + (int) list.get(i).get("count") + "개 입니다");
							break;
						};

						list.get(i).put("count", (int) list.get(i).get("count") - sellCount);

					}
				}

				if (!searchFlg) { // search == false
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			}

			else if (menu == 4) {

				System.out.print("가격을 수정할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					// list.get(i) => HashMap으로 만든 map;
					if (fruitName.equals(list.get(i).get("fruitName"))) {// 이렇게 해도 상관없음 (이경우는)
						searchFlg = true;
						System.out.print("수정할 가격 : ");
						int sellCost = s.nextInt();

						list.get(i).put("price", sellCost);

					}
				}
				if (!searchFlg) { // search == false
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			}

			else if (menu == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

			else {

			}

		}

	}

}
