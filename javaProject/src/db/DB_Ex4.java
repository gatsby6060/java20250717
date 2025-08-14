package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// STUDENT
		// 학번을 입력받아서 해당 학번의 학생이 있으면
		// 해당 학생의 키를 1증가후 '키를 1 증가했습니다.' 출력
		// 없으면 '학생이 없습니다' 출력
		Scanner s = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		String stuNo = s.next();

		String sql  = "UPDATE STUDENT SET " 
					+ "STU_HEIGHT = STU_HEIGHT + 1" 
					+ "WHERE STU_NO = '" + stuNo + "'";

		DBClass db = new DBClass();
		int num = db.stmt.executeUpdate(sql);

		if (num > 0) {
			System.out.println("키를 1 증가했습니다.");
		} else {
			System.out.println("학생이 없습니다");
		}

	}

}
