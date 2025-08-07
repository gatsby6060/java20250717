package day16test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//[문항7]  7. 이미지와 동일하게 동작하도록 코드를 작성하시오. (10점) - 이미지는 카페 참고
//단, 데이터 관리는 ArrayList와 HashMap을 이용해서 할 것.
//
//참고 1. 1번 메뉴에서 동일 이름을 다시 등록 시도할 경우 이미지와 같이 안내문구 띄울 것
//참고 2. 2~4번 메뉴에서 등록되지 않은 이름을 찾을 경우 이미지와 같이 안내문구 띄울 것
//참고 3. 모든 숫자는 음수 입력 불가능하도록 할 것
//참고 4. 포인트 차감은 내가 가진 포인트를 초과해서 차감할 수 없음
public class Quiz7 {

	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print(msg + " : ");
			input = s.nextInt();

			// 가격 100단위 인지 체크하는 조건문
//			if (msg.equals("가격")) {
//				if (input % 100 != 0) {
//					System.out.println("가격은 100단위로 입력해 주세요 ");
//					continue;
//				}
//			}

			// 숫자 0 혹은 음수인지 체크하는 조건문
			if (input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		return input;
	}

	public static HashMap<String, Object> searchCustomer(ArrayList<HashMap<String, Object>> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> getCustomer = list.get(i);
			if (getCustomer.get("name").equals(name)) {
//				System.out.println("같은 사용자 검색됨");
				return getCustomer;

			}
		}
//		System.out.println("같은 사용자 검색 안됨 ");
		return null;
	}

	public static void main(String[] args) {

		System.out.println("=====포인트 관리 프로그램=====");

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("[ (1)사용자 등록 (2)포인트적립 (3)포인트차감 (4)포인트 확인 (5)종료] : ");

			Scanner s = new Scanner(System.in);
			// 키는 사용자고 키밸류는 포인트고
			// 리스트는 키밸류의 집합이다!
			int inputNum = s.nextInt();

			if (inputNum == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				HashMap<String, Object> customer = searchCustomer(list, name); // 개인함수
				if (customer == null) { // 최초에는 널이 리턴될것임
					// 고객 map만들고 list에 추가

					customer = new HashMap<String, Object>();

					customer.put("name", name);

					customer.put("age", checkNumber("나이")); // 개인함수 음수체크
					customer.put("point", checkNumber("포인트")); // 개인함수 음수체크
					list.add(customer);
//					System.out.println("list 값 : "+ list);
				} else { // ex) '사과'등이 담긴 맵이 들어오면...
					// fruit에 있는 과일 개수만 변경(기존거에 입력한거 추가)
//					int sum = (int) customer.get("count") + checkNumber("개수"); // 개인함수 음수체크
//					customer.put("count", sum);
					System.out.println("이미 등록된 사용자입니다.");
					continue;
				}

				System.out.println(name + "님이 등록되었습니다.");

			} else if (inputNum == 2) {
				System.out.print("포인트 적립할 사용자 이름 : ");
				String name = s.next();

				HashMap<String, Object> customer = searchCustomer(list, name); // 개인함수
				if (customer == null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				} else {
					System.out.print("적립할 포인트 : ");
					int point = s.nextInt();
					int sum = (int) customer.get("point") + (int) point;// + checkNumber("포인트");
					customer.put("point", sum);
					System.out.println(customer.get("name") + "님의 포인트가 " + point + "만큼 적립되었습니다.");
				}

			} else if (inputNum == 3) {
				System.out.print("포인트 차감할 사용자 이름 : ");
				String name = s.next();
				HashMap<String, Object> customer = searchCustomer(list, name); // 개인함수
				if (customer == null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				} else {
					System.out.print("차감할 포인트 : ");
					int inputPoint = s.nextInt();
					while (true) {
						if (inputPoint < 0) {
							System.out.println("음수는 불가능 합니다. 다시 입력해주세요");
							System.out.print("차감할 포인트 : ");
							inputPoint = s.nextInt();
						} else {
							break;
						}
					}
					int sum = (int) customer.get("point") - (int) inputPoint;// - checkNumber("포인트");
					customer.put("point", sum);
					if (inputPoint > (int) customer.get("point")) {
						System.out.println("차감 할 있는 포인트는" + customer.get("point") + "입니다.");
					}else {
						
						System.out.println(customer.get("name")+"님의 포인트가 "+inputPoint +"만큼 차감되었습니다.");
					}
//				
				}
			} else if (inputNum == 4) {
				System.out.print("포인트 확인 할 사용자 이름 : ");
				String name = s.next();
				HashMap<String, Object> cst = searchCustomer(list, name); // 개인함수
				if (cst == null) {
					System.out.println("해당 사람이 존재하지 않습니다.");
				} else {
					System.out.print("가격 : " + cst.get("name") );
					System.out.println("개수 : " + cst.get("point") );
				}
			} else if (inputNum == 5) {
				System.out.println("종료되었습니다.");
				break;
			}
		} // while
	} // main
}
