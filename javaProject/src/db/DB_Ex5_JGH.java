package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex5_JGH {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		2. 아이디, 비밀번호, 이름, 성별, 나이를 입력받은 후
//		TBL_USER에 저장. (CDATETIME는 현재시간 저장)
//		단, 아이디 입력 시에 이미 테이블에서 사용하는 아이디를 입력 할 경우
//		'이미 사용중인 아이디 입니다.' 출력 후 다시 입력 받도록 함
		Scanner s = new Scanner(System.in);
		String id;
		while (true) {
			System.out.print("아이디를 입력하세요 : ");
			id = s.next();
			String sql = "Select * from TBL_USER where USERID = '" + id + "'";
			DBClass db = new DBClass();
			ResultSet rs = db.stmt.executeQuery(sql);

			if (rs.next()) {
				System.out.println("이미 사용중인 아이디 입니다.");
			} else {
				break;
			}
		}
		
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = s.next();
		System.out.print("이름을 입력하세요 : ");
		String nm = s.next();
		System.out.print("성별을 입력하세요 : ");
		String gen = s.next();
		System.out.print("나이을 입력하세요 : ");
		String age = s.next();

		
		String sql  = "INSERT INTO TBL_USER " 
					+ "VALUES ('"
								+ id +"','"+ pw +"','"+ nm + "','" 
								+ gen + "'," + age + "," + "SYSDATE"
							+ ")";
		
//		System.out.println(sql);
		
		DBClass db = new DBClass();
		int num = db.stmt.executeUpdate(sql);

		if (num > 0) {
			System.out.println("인서트 됬겠지머");
		} else {
			System.out.println("인서트 안된거 같은데?");
		}
	}

}
