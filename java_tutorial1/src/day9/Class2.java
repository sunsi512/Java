package day9;

public class Class2 {
	public static void main(String[] args) {
		SterBu s = new SterBu();
		s.coffee();
		s.sell();
		
		// 다형성 : 객체화를 할 때 상속한 인터페이스의 이름으로 통일
		// 코드수정을 줄이고 재사용 비율을 늘림.
		starbucks star1 = new SterBu();
	}
}

// 스타벅스
interface starbucks{
	void sell();
	void coffee();
}

class SterBu implements starbucks{

	@Override
	public void sell() {
		System.out.println("스타벅스 부평점에서 커피를 판다");
		
		
	}

	@Override
	public void coffee() {
		System.out.println("스타벅스 부평점에서 커피를 만든다");
	}
	
class SterSin implements starbucks{

	@Override
	public void sell() {
		System.out.println("스타벅스 신촌점에서 커피를 판다");
		
	}

	@Override
	public void coffee() {
		System.out.println("스타벅스 신촌점에서 커피를 만든다");
		
	}
}
class Sterkang implements starbucks{

	@Override
	public void sell() {
		System.out.println("스타벅스 강남점에서 커피르 판다");
		
	}

	@Override
	public void coffee() {
		System.out.println("스타벅스 강남점에서 커피를 만든다");
		
	}
	
}
	
}
// 스타벅스 강남점
// 스타벅스 신천점
// 스타벅스 부평점