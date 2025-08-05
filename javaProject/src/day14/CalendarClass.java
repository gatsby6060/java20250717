package day14;

import java.util.Calendar;

public class CalendarClass {

	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		// get()은0~30까지의정수리턴.
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 자동?으로 오늘 날자 정보 들이 담겨있다.
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(msg + year + "/" + month + "/" + day + "/");
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
//		case 1:
			System.out.print("일요일");
			break;
		case Calendar.MONDAY:
//		case 2:
			System.out.print("월요일");
			break;
		case Calendar.TUESDAY:
//		case 3:
			System.out.print("화요일");
			break;
		case Calendar.WEDNESDAY:
//		case 4:
			System.out.print("수요일");
			break;
		case Calendar.THURSDAY:
//		case 5:
			System.out.print("목요일");
			break;
		case Calendar.FRIDAY:
//		case 6:
			System.out.print("금요일");
			break;
		case Calendar.SATURDAY:
//		case 7:
			System.out.print("토요일");
			break;
		}
		System.out.print("(" + hourOfDay + "시)");
		if (ampm == Calendar.AM)
			System.out.print("오전");
		else
			System.out.print("오후");
		System.out.println(hour + "시" + minute + "분" + second + "초" + millisecond + "밀리초");
	}

	public static void main(String[] args) {

//		Calendar now = Calendar.getInstance();
//		System.out.println(now.get(Calendar.YEAR));

		Calendar now = Calendar.getInstance(); // 현재 시간이 담겨있음
		printCalendar("현재", now); // 현재 시간이 담겨있음
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		// 2016년12월25일. 12월을표현하기위해month에11로설정
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁8시 // 상수 이용 public static final int HOUR_OF_DAY = 11;
		firstDate.set(Calendar.MINUTE, 30); // 30분
		printCalendar("처음데이트한날은", firstDate);

	}
}
