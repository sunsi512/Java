package day3;

import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요 >> ");
		int 년도 = sc.nextInt();
		System.out.println("월을 입력하세요 >> ");
		int 월 = sc.nextInt();
		
		
		switch (월) {
		case 1:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 3:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 5:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 7:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 8:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 10:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 12:
			System.out.println(년도+"년 "+월+"월은 31일까지 있습니다.");
			break;
		case 4:
			System.out.println(년도+"년 "+월+"월은 30일까지 있습니다.");
			break;
		case 6:
			System.out.println(년도+"년 "+월+"월은 30일까지 있습니다.");
			break;
		case 9:
			System.out.println(년도+"년 "+월+"월은 30일까지 있습니다.");
			break;
		case 11:
			System.out.println(년도+"년 "+월+"월은 30일까지 있습니다.");
			break;
		case 2:
			if(년도 % 4 == 0 && 년도 % 100 != 0 || 년도 % 400 == 0) {
				System.out.println(년도+"년 "+월+"월은 29일까지 있습니다.");
				
			}else {
				System.out.println(년도+"년 "+월+"월은 28일까지 있습니다.");
			}
			break;

		default:
			System.out.println("?");
			break;
			
		
		}
	}
}
