package day6;

public class Class7 {
	public static void main(String[] args) {
		
//		System.out.println();
		// 홍길동은 한국에서 온 23살이다.
		// 아무개는 캐나다에서 온 22살이다.
		
		person p = new person();
		p.setName("홍길동");
		p.setCountry("한국");
		p.setAge(23);
		
		person w = new person();
		w.setName("아무개");
		w.setCountry("캐나다");
		w.setAge(22);
		
		System.out.println(p.getName()+"은 "+p.getCountry()+"에서 온 "+p.getAge()+"살이다.");
		System.out.println(w.getName()+"는 "+w.getCountry()+"에서 온 "+w.getAge()+"살이다.");		
		
	}
}


// 클래스명 : person
// 변수 : 이름, 나라, 나이
// 함수 : get, set

class person{
	private String name;
	private String country;
	private int age;
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