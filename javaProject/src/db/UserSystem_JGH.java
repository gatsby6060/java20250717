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
public class UserSystem_JGH {
	
	
	public static boolean userlogin() throws SQLException {
		Scanner s = new Scanner(System.in); 
		
		System.out.print("아이디 입력 : ");

		String id = s.next();
		System.out.print("비밀번호 입력 : ");
		String pw = s.next();

		String sql = "Select * from TBL_USER " + "where USERID = '" + id + "'" + "AND PASSWORD = '" + pw + "'";
		DBClass db = new DBClass();
		ResultSet rs = db.stmt.executeQuery(sql);

		if (rs.next()) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		return rs.next(); //테스트중
	};
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();

		while (true) {
			System.out.println("사용자 관리 시스템");
			System.out.print("메뉴 1. 회원가입  2. 로그인  3. 비밀번호수정 " + " 4. 정보확인  5. 탈퇴");

			Scanner s = new Scanner(System.in);
			int inputMenu = s.nextInt();

			if (inputMenu == 1) {
				System.out.println("회원가입 진행 ");
				String id = "";
				while (true) {
					System.out.print("아이디 : ");
					id = s.next();
					ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + id + "'");
					if (rs.next()) {
						System.out.println("중복된 아이디가 있습니다. 다시 입력해주세요.");
					} else {
						break;
					}
				}
				System.out.print("비밀번호 입력 : ");
				String pwd = s.next();
				System.out.print("이름 입력 : ");
				String name = s.next();

				String query = "INSERT INTO TBL_USER (USERID,PASSWORD,NAME,CDATETIME) " + "VALUES(" + "'" + id + "',"
						+ "'" + pwd + "'," + "'" + name + "'," + "SYSDATE)";
				int num = db.stmt.executeUpdate(query);

				if (num > 0) {
					System.out.println("가입되었습니다!");
				} else {
					System.out.println("오류가 발생했습니다. 다시 시도해주세요.");
				}
			}

			// 메뉴 2. 로그인
//		  -> 아이디, 비밀번호 입력 받은 후 
//		  -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
//		  -> 아이디가 없는경우 '아이디를 확인해주세요'
//		  -> 둘다 일치하는 경우 '로그인 성공!'
			else if (inputMenu == 2) {
//				System.out.print("아이디 입력 : ");
//
//				String id = s.next();
//				System.out.print("비밀번호 입력 : ");
//				String pw = s.next();
//
//				String sql = "Select * from TBL_USER " + "where USERID = '" + id + "'" + "AND PASSWORD = '" + pw + "'";
//				ResultSet rs = db.stmt.executeQuery(sql);
//
//				if (rs.next()) {
//					System.out.println("로그인 성공");
//				} else {
//					System.out.println("로그인 실패");
//				}
				
				userlogin();
			}

			// 메뉴 3. 비밀번호수정
//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//		  -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
			else if (inputMenu == 3) {
				System.out.println("비밀번호 수정 진입 일단 로그인 진행");
				System.out.print("아이디 입력 : ");

				String id = s.next();
				System.out.print("비밀번호 입력 : ");
				String pw = s.next();

				String sql = "Select * from TBL_USER " + "where USERID = '" + id + "'" + "AND PASSWORD = '" + pw + "'";
				ResultSet rs = db.stmt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("로그인 성공");

					System.out.println("이제 수정 진행");

					System.out.print("수정할 암호 입력 : ");
					String pwd = s.next();

					String sql2 = "UPDATE TBL_USER SET" + " PASSWORD = " + "'" + pwd + "'" + " WHERE USERID= '" + id
							+ "'";

					System.out.println(sql2);
					DBClass db2 = new DBClass();
					int num = db2.stmt.executeUpdate(sql2);

					if (num > 0) {
						System.out.println("비밀번호를 수정완료");
					} else {
						System.out.println("비밀번호를 수정 못!했습니다!");
					}

				} else {
					System.out.println("로그인 실패");
				}
			}

			// 메뉴 4. 정보확인
//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//		  -> 사용자 아이디, 이름, 가입날짜(YYYY-MM-DD HH24:MI:SS) 출력
			else if (inputMenu == 4) {
				System.out.println("정보확인 진입 일단 로그인 진행");
				System.out.print("아이디 입력 : ");

				String id = s.next();
				System.out.print("비밀번호 입력 : ");
				String pw = s.next();

				String sql = "Select T.*, TO_CHAR(T.CDATETIME,'YYYY-MM-DD') as udate from TBL_USER T "
						+ "where T.USERID = '" + id + "'" + "AND T.PASSWORD = '" + pw + "'";
				ResultSet rs = db.stmt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("로그인 성공");
					System.out.println("사용자 아이디 " + rs.getString("USERID") + "\t");
					System.out.println("사용자 이름 " + rs.getString("NAME") + "\t");
					System.out.println("가입날짜 " + rs.getString("udate") + "\t");

				} else {
					System.out.println("로그인 실패");
				}
			}

			else if (inputMenu == 5) {
				// 메뉴 5. 탈퇴
//			  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
//			  -> '정말 탈퇴하시겠습니까?' 출력 후 'Y' 입력 시 해당 아이디 삭제
//			  -> 그 외 값 누르면 다시 메뉴로 이동

				System.out.println("탈퇴 진입 일단 로그인 진행");
				System.out.print("아이디 입력 : ");

				String id = s.next();
				System.out.print("비밀번호 입력 : ");
				String pw = s.next();

				String sql = "Select T.*, TO_CHAR(T.CDATETIME,'YYYY-MM-DD') as udate from TBL_USER T "
						+ "where T.USERID = '" + id + "'" + "AND T.PASSWORD = '" + pw + "'";
				ResultSet rs = db.stmt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("로그인 성공");
					System.out.print("정말 탈퇴 하시겠습니까? Y 입력시 탈퇴됨");
					String realout = s.next();

					if (realout.equals("Y")) {
						DBClass db2 = new DBClass();

						String sql2 = "DELETE FROM TBL_USER WHERE USERID = " + "'" + id + "'";
						int num = db2.stmt.executeUpdate(sql2); // 오토커밋임

						if (num > 0) {
							System.out.println("삭제되었습니다.");
						} else {
							System.out.println("삭제 안! 되었습니다. ");
						}
					} else {
						System.out.println("Y외의 다른 값이 입력되었습니다. 메뉴로 이동합니다.");
						break;
					}

				} else {
					System.out.println("로그인 실패");
				}
			}

			else {
				System.out.println(" 1 2 3 4 5 값이 아님 종료");
				break;
			}

		} // while

	}

}
