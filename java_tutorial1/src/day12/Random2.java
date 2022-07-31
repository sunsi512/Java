package day12;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		Rand3 r = new Rand3();
		r.go(num1, num2);
	}
}

class Rand3{
	// 입력받은 두 수 사이에서 랜덤
	Random rand = new Random();
	public void go(int n1, int n2) {
		int result = rand.nextInt(n2-n1+1)+n1;
		System.out.println(result);
	}
}
// 값을 체인지 하는 법
// n1, n2라고 가정한다면, 
/*n1의 값을 다른 저장소에 백업,
 * n1에 n2값을 담음
 * n2에 백업값(n1)을 담음.*/
