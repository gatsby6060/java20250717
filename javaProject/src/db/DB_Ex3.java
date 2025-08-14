package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Ex3 {
	public static void main(String[] args) {

		DBClass db = new DBClass();
		// 1. TBL_USER에 있는 모든 사용자 출력
		// 출력 컬럼은 아이디, 이름, 성별(M이면 '남자'로 출력, F면 '여자'로 출력)
		// 출력 형식은 예시 '아이디 : hong123, 이름 : 홍길동, 성별 : 남자'
		try {
			String sql = "SELECT * FROM TBL_USER";
			ResultSet rs = db.stmt.executeQuery(sql);

			while (rs.next()) {
				String id = rs.getString("USERID");
				String name = rs.getString("NAME");
				String gender = rs.getString("GENDER").equals("M") ? "남자" : "여자";
				System.out.println("아이디 : " + id + ", 이름 : " + name + ", 성별 :" + gender);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
