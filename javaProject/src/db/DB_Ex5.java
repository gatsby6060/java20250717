package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 2. 아이디, 비밀번호, 이름, 성별, 나이를 입력받은 후
		// TBL_USER에 저장. (CDATETIME는 현재시간 저장)
		// 단, 아이디 입력 시에 이미 테이블에서 사용하는 아이디를 입력할 경우
		// '이미 사용중인 아이디 입니다' 출력 후 다시 입력받도록 함
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		
//		boolean idCheck = true;
//		while(idCheck) {
//			System.out.print("아이디 : ");
//			String id = s.next();
//			ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + id + "'");
//			idCheck = rs.next();
//		}
		String id = "";
		while(true) {
			System.out.print("아이디 : ");
			id = s.next();
			ResultSet rs = db.stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '" + id + "'");
			if(rs.next()) {
				System.out.println("중복된 아이디가 있습니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		
		System.out.print("비밀번호 : ");
		String pwd = s.next();
		System.out.print("이름 : ");
		String name = s.next();
		System.out.print("성별 : ");
		String gender = s.next();
		System.out.print("나이 : ");
		String age = s.next();
		
		String query = "INSERT INTO TBL_USER VALUES("
						+ "'" + id + "',"
						+ "'" + pwd + "',"
						+ "'" + name + "',"
						+ "'" + gender + "',"
						+ "'" + age + "',"
						+ "SYSDATE)";
		int num = db.stmt.executeUpdate(query);
		if(num > 0) {
			System.out.println("가입되었습니다!");
		} else {
			System.out.println("오류가 발생했습니다. 다시 시도해주세요.");
		}
		
		
		
		
		
	}

}