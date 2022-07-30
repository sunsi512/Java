package day11;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력하세요");
		int price = Integer.parseInt(sc.nextLine());
		
		StringEx1 st = new StringEx1();
		st.go(price);
	}
}

class StringEx1 {

	// 천원 단위로 ,를 붙여주세요
	// 0
	// 00
	// 000
	// 0000
	// 00000
	// 000000
	// 0000000
	public void go(int num) {
		// num을 문자열로
		String str = "" + num;
		String st1;
		String st2;
		String st3;
		if (num < 1000) {
			System.out.println(str);
		}
		else if (num < 10000) {
			st1 = str.substring(0,1);
			st2 = str.substring(1);
			System.out.println(st1+","+st2);
		}
		else if (num < 100000) {
			st1 = str.substring(0,2);
			st2 = str.substring(2);
			System.out.println(st1+","+st2);
		}
		else if (num < 1000000) {
			st1 = str.substring(0,3);
			st2 = str.substring(3);
			System.out.println(st1+","+st2);
		}
		else if (num < 10000000) {
			st1 = str.substring(0,1);
			st2 = str.substring(1,4);
			st3 = str.substring(4);
			System.out.println(st1+","+st2+","+st3);
		}
		else if (num < 10000000) {
			st1 = str.substring(0,1);
			st2 = str.substring(1,5);
			st3 = str.substring(5);
			System.out.println(st1+","+st2+","+st3);
		}


	}
}