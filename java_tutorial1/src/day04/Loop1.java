package day04;

public class Loop1 {
	public static void main(String[] args) {
//		// 0~9
//		for (int i = 1; i <= 5; i++) {
//			if(i == 3) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		// break : 반복문 중단
		// continue : 반복문 1회성 취소 (원래는 중괄호 마치고 조건을 검사하지만, 바로 조건 검사로 넘어감)
		
		for (int i = 1; i <= 10; i++) {
			if(i>5) {
				break;        // 이 코드가 실행되면 반복문 중단
			}
			System.out.println(i);
		}
		System.out.println("================================");
		
		for (int i = 1; i <= 10; i++) {
			if(i%2!=0) {
				continue;		// 이 코드가 실행되면 반복문의 처음으로 돌아감(1회성 취소)
			}
			System.out.println(i);
		}
			
	}
}
