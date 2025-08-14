package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//사용자 관리 시스템
//메뉴 1. 회원가입
//		  -> 아이디, 비밀번호, 이름 입력 받은 후 저장
//		  -> 가입일자는 현재 시간으로 넣기
//		  -> 아이디는 중복체크. 중복된 아이디 입력 시 다시 입력하도록
//메뉴 2. 로그인
//		  -> 아이디, 비밀번호 입력 받은 후 
//		  -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
//		  -> 아이디가 없는경우 '아이디를 확인해주세요'
//		  -> 둘다 일치하는 경우 '로그인 성공!'
//메뉴 3. 비밀번호수정
//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//		  -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
//메뉴 4. 정보확인
//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//		  -> 사용자 아이디, 이름, 가입날짜(YYYY-MM-DD HH24:MI:SS) 출력
//메뉴 5. 탈퇴
//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//		  -> '정말 탈퇴하시겠습니까?' 출력 후 'Y' 입력 시 해당 아이디 삭제
//		  -> 그 외 값 누르면 다시 메뉴로 이동
//그외. 종료
public class UserSystem_JGH2 {

	static Scanner s = new Scanner(System.in);
	static ResultSet rs = null;
	static DBClass db = new DBClass();

	public static boolean userAuth(String query) throws SQLException {
		rs = db.stmt.executeQuery(query);
		// 쿼리 조회 결과가 있으면 true return
		// 없으면 false return
		return rs.next();
	}

	public static void join() throws SQLException {
		String id = "";
		while (true) {
			System.out.print("아이디 : ");
			id = s.next();
			String query = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
			if (userAuth(query)) { // 아이디 중복체크
				System.out.println("중복된 아이디가 있습니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		System.out.print("비밀번호 : ");
		String pwd = s.next();
		System.out.print("이름 : ");
		String name = s.next();

		String query = "INSERT INTO TBL_USER(USERID, PASSWORD, NAME, CDATETIME) VALUES(" + "'" + id + "'," + "'" + pwd
				+ "'," + "'" + name + "'," + "SYSDATE)";
		int num = db.stmt.executeUpdate(query);
		if (num > 0) {
			System.out.println("가입되었습니다!");
		} else {
			System.out.println("오류가 발생했습니다. 다시 시도해주세요.");
		}
	}

	
	public static boolean login() throws SQLException {
		System.out.print("아이디 : ");
		String id = s.next();
		System.out.print("비밀번호 : ");
		String pwd = s.next();
		
		String query = "SELECT U.*, TO_CHAR(CDATETIME, 'YYYY-MM-DD HH24:MI:SS') AS JOINDATE FROM TBL_USER U WHERE USERID = '" + id + "'";
		// 아이디가 있으면 true 없으면 false
		boolean idCheck = userAuth(query); 
		// 아이디+비밀번호가 있으면 true, 없으면 false
		boolean allCheck = userAuth(query + " AND PASSWORD = '" + pwd + "'");
		
		if(allCheck) {
			System.out.println("로그인 성공");
		} else if(idCheck) {
			System.out.println("비밀번호를 확인해주세요.");
		} else {
			System.out.println("없는 아이디 입니다.");
		}
		// 로그인 성공시 true, 실패시 false 리턴
		return allCheck;
	}
	
	
	public static void pwdUpdate() throws SQLException {
		System.out.println("=== 비밀번호 변경을 위해 로그인을 먼저 해주세요. ===");
		if(login()) {
			System.out.print("변경할 비밀번호를 입력해주세요 : ");
			String pwd = s.next();
			String query = "UPDATE TBL_USER SET PASSWORD = '" + pwd + "' WHERE USERID = '" + rs.getString("USERID") + "'";
			int num = db.stmt.executeUpdate(query);
			if(num > 0) {
				System.out.println("수정되었습니다!");
			} else {
				System.out.println("에러가 발생했습니다!");
			}
		}
	}
	
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 사용자 관리 시스템
		// 메뉴 1. 회원가입
		// -> 아이디, 비밀번호, 이름 입력 받은 후 저장
		// -> 가입일자는 현재 시간으로 넣기
		// -> 아이디는 중복체크. 중복된 아이디 입력 시 다시 입력하도록
		// 메뉴 2. 로그인
		// -> 아이디, 비밀번호 입력 받은 후
		// -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
		// -> 아이디가 없는경우 '아이디를 확인해주세요'
		// -> 둘다 일치하는 경우 '로그인 성공!'
		// 메뉴 3. 비밀번호수정
		// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
		// -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
		// 메뉴 4. 정보확인
		// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
		// -> 사용자 아이디, 이름, 가입날짜(YYYY-MM-DD HH24:MI:SS) 출력
		// 메뉴 5. 탈퇴
		// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
		// -> '정말 탈퇴하시겠습니까?' 출력 후 'Y' 입력 시 해당 아이디 삭제
		// -> 그 외 값 누르면 다시 메뉴로 이동
		// 그외. 종료

		Scanner s = new Scanner(System.in);
		while (true) {

			System.out.print("[(1)회원가입 (2)로그인 (3)비밀번호수정 (4)정보확인 (5) 탈퇴 (6) 종료 ] : ");
			int menu = s.nextInt();

			switch (menu) {
			// 메뉴 1. 회원가입
			// -> 아이디, 비밀번호, 이름 입력 받은 후 저장
			// -> 가입일자는 현재 시간으로 넣기
			// -> 아이디는 중복체크. 중복된 아이디 입력 시 다시 입력하도록
			case 1:
				join();
				break;

			// 메뉴 2. 로그인
			// -> 아이디, 비밀번호 입력 받은 후
			// -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
			// -> 아이디가 없는경우 '아이디를 확인해주세요'
			// -> 둘다 일치하는 경우 '로그인 성공!'
			case 2:
				login();
				break;

			// 메뉴 3. 비밀번호수정
			// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
			// -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
			case 3:
				pwdUpdate();
				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			default:
				System.out.println("1~6은 아닌듯");
				break;
			}

		} // while

	} // main

//	public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	// 사용자 관리 시스템
	// 메뉴 1. 회원가입
	// -> 아이디, 비밀번호, 이름 입력 받은 후 저장
	// -> 가입일자는 현재 시간으로 넣기
	// -> 아이디는 중복체크. 중복된 아이디 입력 시 다시 입력하도록
	// 메뉴 2. 로그인
	// -> 아이디, 비밀번호 입력 받은 후
	// -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
	// -> 아이디가 없는경우 '아이디를 확인해주세요'
	// -> 둘다 일치하는 경우 '로그인 성공!'
	// 메뉴 3. 비밀번호수정
	// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
	// -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
	// 메뉴 4. 정보확인
	// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
	// -> 사용자 아이디, 이름, 가입날짜(YYYY-MM-DD HH24:MI:SS) 출력
	// 메뉴 5. 탈퇴
	// -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
	// -> '정말 탈퇴하시겠습니까?' 출력 후 'Y' 입력 시 해당 아이디 삭제
	// -> 그 외 값 누르면 다시 메뉴로 이동
	// 그외. 종료

//		while(true) {
//			System.out.print("[(1)회원가입 (2)로그인 (3)비밀번호수정 (4)정보확인 (5) 탈퇴 (6) 종료 ] : ");
//			int menu = s.nextInt();
//			switch (menu) {
//			case 1:
//				join();
//				break;
//			case 2: 
//				login();
//				break;
//			case 3: 
//				pwdUpdate();
//				break;
//			case 4:
//				userInfo();
//				break;
//			case 5:
//				userWithdrawal();
//				break;
//			default:
//				System.out.println("종료되었습니다.");
//				break; //스이치 케이스 자체를 빠져나감
//			}
//			
//		    if (menu < 1 || menu > 5) {
//		        break; 
//		    }
//		}

}
