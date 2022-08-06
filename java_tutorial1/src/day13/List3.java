package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
	Menu1 m = new Menu1();
	m.go();
	}
}

class Menu1{
	public void go() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			String str = sc.next();
			if(str.equals("1")) {
				System.out.println("추가할 항목을 입력해주세요");
				String Str = sc.next();
				arr.add(Str);
			}else if(str.equals("2")) {
				System.out.println("수정할 위치를 입력해주세요");
				int st = sc.nextInt();
				System.out.println("수정할 내용을 입력해주세요");
				String Str = sc.next();
				arr.set(st-1, Str);
			}else if(str.equals("3")) {
				System.out.println("삭제할 위치를 입력해주세요");
				int st = sc.nextInt();
				arr.remove(st-1);
			}else if(str.equals("4")) {
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i)+" ");
				}
			}else if(str.equals("0")) {
				break;
			}
		}
	}
}