package day06;

public class Array1 {
	public static void main(String[] args) {
		Array1Ex array1Ex = new Array1Ex();
		array1Ex.go();
	}
}

class Array1Ex{
	public void go() {
		// String, int, double, boolean, 배열
		int num1 = 1000, num2 = 1500, num3 = 1200;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// 카페 메뉴의 가격을 전부 보고 싶다.
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		int num[] = {1000, 2000, 3000, 4000, 2500};
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
		for (int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		String ss[] = {"a","b","c","d"};
		int nn[] = {1,2,3,4};
		double dd[] = {1.0, 2.0, 3.0, 4.0};
		boolean bb[] = {false, true, true,false}; 
	}
}