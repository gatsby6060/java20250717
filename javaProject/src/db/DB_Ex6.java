package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex6 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 로그인
		// 아이디, 비밀번호 입력받아서
		// 두개와 일치하는 레코드가 있으면 '로그인 성공!'
		// 없으면 '로그인 실패!' 출력
		
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		
		System.out.print("아이디 : ");
		String id = s.next();
		System.out.print("비밀번호 : ");
		String pwd = s.next();
		
		String query = "SELECT * FROM TBL_USER "
						+ "WHERE USERID = '" + id + "' AND PASSWORD = '" + pwd + "'";
		
		ResultSet rs = db.stmt.executeQuery(query);
		if(rs.next()) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		
	}
}