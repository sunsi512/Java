package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		Thr1 t1 = new Thr1();
		Thr2 t2 = new Thr2();
		Thread_3 t3 = new Thread_3();
		Thread tt3 = new Thread(t3);		// Runnable로 만들었을 경우		
		
		t1.start();
		t2.start();
		tt3.start();
		
	}
}

// 쓰레드를 생성하여 동시에 2개의 작업을 수행하세요

class Thr1 extends Thread{
	public void run() {			// run으로 만들고 start로 실행
		System.out.println("반복할 문자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}

class Thr2 extends Thread{
	public void run() {			// 추가쓰레드의 main함수(run으로 만들고 start로 실행)
		while(true) {
			System.out.println("Hello World");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 자바는 다중상속이 안되기 때문에 추가로 상속할 수 있는 인터페이스를 제공 : Runnable
class Thread_3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("BGM 재생 중");
			try {
				Thread.sleep(200);		// 0.01초 쓰레드 중지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}