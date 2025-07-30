package review_day2;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 5, 2 };
		int sumArr = ArrayFunc.sum(arr);
		System.out.println("배열 합 : " + sumArr); // 배열안 값의 총 합 결과 출력

		int num = ArrayFunc.indexValue(arr, 2); // 2번째 인덱스면 3번째 숫자를 돌려달라는 뜻
		System.out.println(num); // 두번째 파라미터로 보낸 값의 위치에 있는 값
		
		double avg = ArrayFunc.avg(arr);
		System.out.println(avg); // 배열안에 전체 평균값
		
		boolean isFlg = ArrayFunc.searchValue(arr, 3);
		System.out.println(isFlg); 
		//두번째 파라미터로 보낸 값이 배열 내에 존재하면 true
		//없으면 false 리턴
		
		

		
	}

}
