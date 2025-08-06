package day15;

public class StringEx {
	public static void main(String[] args) {

		String str = "Show Me The Money";
//		System.out.println((int) 'A');
		for (int i = 0; i < str.length(); i++) {
//			int word = str.charAt(i); //캐릭터는 숫자가 될 수 있다 이걸 적당히 숫자 늘려서줄여서 소문자도 가능
			// 캐릭터를 문자열로
			String word = Character.toString(str.charAt(i));
			// 문자열을 소문자로
			System.out.println(word.toLowerCase());
		}
	}
}
