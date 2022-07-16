package day7;

public class Extends2 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.Info();
		Member m1 = new Member();
		m1.Info("아무개", 33);
	}
}

class Human{
		// private : 내 클래스 안에서만 사용 가능
	//double weight;
	protected int age;			// protected : 상속받은 곳까지는 허용
	//public double height;
	protected String name;
	
	public void Info(String name, int age)
	}
	

	
}
// 상속 : extends 기존의 클래스를 일부만 수정/추가해서 사용하고 싶을 때
class Member extends Human{
	// Human의 코드가 복붙되어 있음
	// 상속을 해서 수정하는 것 : 오버라이딩
//	public void Info(String name, int age) {
		public void Info() {
		this.name = name;
		this.age = age;
		System.out.println("이름은 "+this.name+"이고, 나이는 "+this.age);
	}
	
	public void Info(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	public void go() {
		name = "aa";
		age = 1;
	}
}