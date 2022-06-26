package day02;

public class If3 {
	public static void main(String[] args) {
		int 비밀번호 = 1234;
		int 입력번호 = 1234;
		
		if(비밀번호 == 입력번호) {
			System.out.println("어서오십시오");
		} else {
			System.out.println("누구세요");
		}
		
		
		int 나이 = 20;
		if(나이 >= 20) { 
			System.out.println("성인");
		}
		else {
			System.out.println("미성년자");
		}
	}
}
