package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();

		while (true) {
			System.out.print(" [ (1)추가 (2)확인 (3)삭제 (4)종료 ] : ");
			int menu = s.nextInt(); // 요기서 무조건 입력전까지 대기임
			if (menu == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();

				Human human = new Human(name, age, addr);
				list.add(human); // 일단 주소는 띄어쓰기 불가
			} 
			
			else if (menu == 2) {
				for (int i = 0; i < list.size(); i++) {
//					Human human = list.get(i);
					System.out.println((i + 1) 
							+ ". 이름 : " + list.get(i).getName() 
							+ ", 나이 : " + list.get(i).getAge() 
							+ ", 주소 : " + list.get(i).getAddr());
				}
			} 
			
			else if (menu == 3) {
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String name = s.next();
//				int count = 0;
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					Human human = list.get(i);
					if (human.getName().equals(name)) {
						searchFlg = true;
						list.remove(i);
						i--; // 인덱스가 하나씩 앞으로 당겨져서 다시 확인하려고 --를 해준다.
						System.out.println("삭제 되었습니다.");
					} 

					if(!searchFlg) {
						System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
					}

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
