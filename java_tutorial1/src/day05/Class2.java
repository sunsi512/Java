package day05;

public class Class2 {
	String 변수; 
	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		mc.add(1,2);
		mc.sub(3, 4);
		
		// 더하기 == add, 빼기 == sub, 곱하기 == mul, 나누기 == div
		
		// 클래스명 변수명 = new 클래스명(); 		== 객체화(클래스를 변수로 만듬)
		Mystr 객체화 = new Mystr(); 
		객체화.saveprint("안녕하세요");
		객체화.myprint();
	}
}

// 클래스 : 함수 + 변수
// 메서드 : 클래스 안에 있는 함수
class MyClass2{
	// MyClass2 안에 사칙연산 기능 +, -, *, /
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	void sub(int n1, int n2) {
		System.out.println(n1-n2);
	}
	
	void mul(int n1, int n2) {
		System.out.println(n1*n2);
	}
	
	void div(int n1, int n2) {
		System.out.println(n1/n2);
	}
}

class Mystr{
	String str = "";
	void myprint() {
		System.out.println(str);
	}
	void saveprint(String in) {
		str = in;
		
	}
}