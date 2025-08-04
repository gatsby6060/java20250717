package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();

		while (true) {
			System.out.print(" [ (1)추가 (2)확인 (3)삭제 (4)종료 ] : ");
			int menu = s.nextInt(); // 요기서 무조건 입력전까지 대기임
			if (menu == 1) {
				HashMap<String, Object > map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				System.out.print("나이 : ");
				int age = s.nextInt();
				map.put("age", age);
				System.out.print("주소 : ");
				String addr = s.next();
				map.put("addr", addr);

//				Human human = new Human(name, age, addr);

				list.add(map); // 일단 주소는 띄어쓰기 불가
			} 
			
			else if (menu == 2) {

				for(int i = 0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					System.out.println(user);
				}
				
				System.out.println(list);
				
			} 
			
			else if (menu == 3) {
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String name = s.next();

				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object > user = new HashMap<>();
					user = list.get(i);
//					System.out.println("name는" + name);
					if (name.equals((String)user.get("name"))) {
						searchFlg = true;
						list.remove(i);
						i--; // 인덱스가 하나씩 앞으로 당겨져서 다시 확인하려고 --를 해준다.
						System.out.println("삭제 되었습니다.");
					} 
				}
				
				if(!searchFlg) {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
			}

			else if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} 
			
			else {
				System.out.println("1~4중에 선택해 주세요.");
			}
			System.out.println("----------------------------------");
		}

	}
}
