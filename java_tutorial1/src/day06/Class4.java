package day06;

public class Class4 {
	public static void main(String[] args) {
		// 사칙연산 클래스를 사용
		사칙연산 a = new 사칙연산();
		a.더하기(1, 2);
		a.빼기(2, 1);
		a.곱하기(1, 2);
		a.나누기(2, 2);
	}
}

class 사칙연산{
	// 더하기, 빼기, 곱하기, 나누기
	void 더하기(int num1, int num2) {
		System.out.println(num1+num2);
	}
	void 빼기(int num1, int num2) {
		System.out.println(num1-num2);
	}
	void 곱하기(int num1, int num2) {
		System.out.println(num1*num2);
	}
	void 나누기(int num1, int num2) {
		System.out.println(num1/num2);
	}
}