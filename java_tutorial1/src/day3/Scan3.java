package day3;

import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 국어;
		int 영어;
		int 수학;
		
		System.out.print("국어 점수를 입력하세요 >>> ");
		국어 = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 >>> ");
		영어 = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 >>> ");
		수학 = sc.nextInt();
		
		int 합계 = 국어+영어+수학;
		
		if(!(국어 >= 40) || !(영어 >= 40) || !(수학 >= 40) || !(합계 >= 150)){
			System.out.println("불합격입니다.");
		}else {
			System.out.println("합격입니다.");
		}
	}
}


