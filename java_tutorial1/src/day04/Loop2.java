package day04;

public class Loop2 {
	public static void main(String[] args) {
		// if 안에 if, switch
		// switch 안에 if, switch
		// for 안에 if
//		for (int i = 0; i < 3; i++) {
//			if(1 == 2) {
//				System.out.println("i의 값은 "+i);
//			}
//			if(i == 3) {
//				System.out.println("i의 값은 3이다");
//			}
		
		// for 안에 for : 이중for문
		for (int i = 0; i < 3; i++) {		// 바깥
			
			for (int j = 0; j < 3; j++) {		// 안쪽
				System.out.println("바깥 = "+i+ " 안쪽 = "+j);
			}
		}
		// 이중for문 끝
	}
}
