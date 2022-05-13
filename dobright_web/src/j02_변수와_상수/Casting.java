package j02_변수와_상수;

public class Casting {

	public static void main(String[] args) {
		// 업캐스팅 - 문자 -> 정수 -> 실수 (묵시적 형 변환 ; 변환 타입 생략 가능 )
		char a = 'A';
		System.out.println(a);
		int b = a; 
		int c = 'A'; // 가능 - 정수에 문자를 넣음 
		// int d = 3.14; // 안됨 - 정수에 실수를 넣음 ; 데이터 손실
		System.out.println(b); // b에 대한 아스키코드 나옴 
		
//		double c = b;
//		System.out.println(c);
//		int d = c;
//		System.out.println(d); // 안됨 ; 데이터 손실
		
		int d = (int)c; // 해결 ; 개발자의 의도라는 걸 알려줌
		System.out.println(d);
		char e = (char) d;
		System.out.println(e);
		
		// 다운캐스팅 - 실수 -> 정수 -> 문자 (명시적 형 변환 ; 변환 타입 항상 입력 )
		
	}

}