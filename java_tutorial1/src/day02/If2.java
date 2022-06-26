package day02;

public class If2 {
	public static void main(String[] args) {
		int 나이 = 20;
		if(나이 >= 20) {
			System.out.println("성인");
		}
		if(나이 >= 14 && 나이 < 20) {
			System.out.println("청소년");
		}
		if(나이 < 14) {
			System.out.println("어린이");
		}
	}

}
