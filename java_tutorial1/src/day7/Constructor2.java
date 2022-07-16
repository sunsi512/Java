package day7;

public class Constructor2 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", "한국", 23 );
		p.go();
		
		Person w = new Person("아무개", "캐나다", 22);
		w.go();
	}
}

class Person{
	private String name;
	private String country;
	private int age;
	
	// 생성자를 통해서 set
	
	Person(String 이름, String 나라, int 나이){
		setName(이름);
		setCountry(나라);
		setAge(나이);
	}
	
	public void go() {		// main
		// go함수를 통해서 syso(get)
		info();
	}
	
	public void info() {
		System.out.println(getName()+"은 "+getCountry()+"에서 온 "+getAge()+"살이다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}