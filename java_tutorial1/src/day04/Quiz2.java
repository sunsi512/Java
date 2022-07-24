package day04;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String 수도 = "서울";
		String 수도_sc;
	
		while(true) {
			System.out.println("대한민국의 수도는? (게임을 종료하려면 0을 입력하세요.)");
			수도_sc = sc.next();
			if(수도.equals(수도_sc)){
				System.out.println("정답입니다.");
				break;
			}else{
				if(수도_sc.equals("0")) {
					break;
				}
				System.out.println("틀렸습니다.");
			}	
		}
	}
}
