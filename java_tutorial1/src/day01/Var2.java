package day01;

public class Var2 {
	public static void main(String[] args) {
		// 변수 (variabie)
		// 변수 선언 : 공간 생성
		// 자료형 변수이름;
		
		// 숫자형 변수 : 숫자를 저장할 수 있는 공간
		int 정수변수;
		// 소수점숫자형 변수 : 소수점있는 숫자를 저장할 수 있는 공간
		double 실수변수;
		// 글자 변수 : 글자를 저장할 수 있는 공간
		String 문자열변수;
		
		// 변수에 데이터를 넣는 방법 : =을 기준으로 왼쪽 공간에 오른쪽의 데이터를 넣는다.
		정수변수 = 333;
		실수변수 = 3.14;
		문자열변수 = "입력할 글자를 넣자";
		// =은 대입의 의미(같다X)
		정수변수 = 314;
		실수변수 = 정수변수;       // 왼쪽은 공간, 오른쪽은 들어있는 값... =을 기준으로
		
		// 변수 사용
		System.out.println(정수변수);
		System.out.println(실수변수);
		System.out.println(문자열변수);
		
		// 선언과 대입을 동시에 (초기화)
		String 글자1 = "공간생성과 동시에 데이터를 넣는 것을 초기화라고 한다.";
		System.out.println(글자1);
		글자1 = "초기화와 대입의 차이점은 앞에 자료형이 있냐없냐다.";
		글자1 = "초기화 혹은 선언은 같은 이름으로 한번만 가능하고 대이은 무한정 가능하다.";
		// String 글자1;    <- 글자1이 이미 있기때문에 앞에 자료형을 적으면 안됨
		
		// int : 숫자(정수)
		// double : 소수점있는 숫자(실수)
		// String : 글자(문자열)
	}
}
