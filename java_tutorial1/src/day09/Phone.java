package day09;


public class Phone {
	public static void main(String[] args) {
	}
}

// 인터페이스1 : 상속을 여러개 하기 위해서 
// 인터페이스2 : 반드시 만들어줘야하는 함수를 정해놓기 위해서
// 인터페이스3 : 다형성

interface KPhone{
	// 전화, 문자 함수 만들기를 강요
	void call(int num);					// 전화
	void msg(int num, String str);		// 문자
}
	
// 2G : 전화 + 문자
class Phone2G implements KPhone{
	// 2G폰을 만드는 사람은 전화와 문자기능을 빼놓을 수 없음
	public void call(int num) {
		System.out.println(num+"에 전화합니다.");
	}

	@Override
	public void msg(int num, String str) {
		// 반드시 만들어줘야 하는 기능2
		System.out.println(num+"에 문자를 보냅니다."+str);
		
	}
	
class Phone3G extends Phone2G{
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
class Phone4G extends Phone3G{
	public void lte() {
		System.out.println("속도가 빨라집니다");
	}

class Phone5G extends Phone4G{
	public void BigData() {
		System.out.println("빅데이터를 활용합니다.");
	}
}
}
}
}