package day6;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Array4Ex a = new Array4Ex();
		a.go();
	}
}

class Array4Ex{
	Scanner sc = new Scanner(System.in);
	public void go() {
		
		System.out.println("어느 나라의 수도가 궁금하신가요?");
		String input = sc.next();
		
		String nations[] = {"대한민국", "중국", "일본", "미국"};
		String cities[] = {"서울", "베이징", "도쿄", "워싱턴"};
		
		for (int i = 0; i < cities.length; i++) {
			if(input.equals(nations[i])) {
			System.out.println(nations[i]+"의 수도는 "+cities[i]+"입니다.");
			}
		}
	}
}