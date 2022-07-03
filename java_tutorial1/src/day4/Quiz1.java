package day4;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1번
		String id = "hello";
		String pw = "1234";
		Scanner sc = new Scanner(System.in);
		String id_sc, pw_sc;

		for (int i = 1; i < 6; i++) {
			int 횟수 = 0;
			System.out.println("아이디를 입력해주세요");
			id_sc = sc.next();
			System.out.println("비밀번호를 입력해주세요");
			pw_sc = sc.next();
			
			if(!(id.equals(id_sc)) || !(pw.equals(pw_sc))) {
				System.out.println("비밀번호가 맞지 않거나 아이디가 존재하지 않습니다.");
				if(i==5) {
					System.out.println("횟수 초과");
				}
			}else {
				System.out.println("로그인 했습니다.");
				break;
			}
		}
		
		System.out.println("============================================");
		
		}
	}
