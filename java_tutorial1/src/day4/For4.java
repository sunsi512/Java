package day4;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		// 아이디와 비밀번호 맞추기
		// 무한 반복
		String id = "hello";
		String pw = "1234";
		Scanner sc = new Scanner(System.in);
		String id_sc, pw_sc;
		
		while(true) {
			System.out.println("아이디 입력");
			id_sc = sc.next();
			System.out.println("비밀번호 입력");
			pw_sc = sc.next();
			
			if(!(id.equals(id_sc))|| !(pw.equals(pw_sc))) {
				System.out.println("아이디가 존재하지 않거나 비밀번호가 맞지 않습니다.");
				
			}else {
				System.out.println("로그인 되었습니다.");
				break;
			}
		}
	}
}
