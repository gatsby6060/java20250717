package day13;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3); // 값만 넣어도 아라서 인덱스 증가
		list.add(100); // 값만 넣어도 아라서 인덱스 증가
		list.add(30);
		list.add(1, 500);
//		[3,500,100,30]
		

//		배열명[0] = 10; //배열은 이렇게...
		
		
		list.remove(0);
//		[500,100,30] 0번쨰를 지우면 아라서 인덱스를 앞으로 떙겨줌
		
		
		for(int i= 0; i<list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("홍길동");
		strList.add("김철수");
		strList.add("박영희");
		
		ArrayList<Object> objList = new ArrayList<>();
		objList.add(1);
		objList.add("자바");
		objList.add(true);
		objList.add(list);
		objList.add(strList); // object로 만들면 고정된 관리가 어려울수 있다. 숫자만 받거나 해야 할때는 Integer
		// 목적에 맞게 object를 쓰면 좋긴하다.
	}

}
