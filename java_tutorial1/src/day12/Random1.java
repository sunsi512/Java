package day12;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Rand1 r1 = new Rand1();
		r1.go3();
		
		Rand1 r2 = new Rand1();
		r2.go2();
	}
}

class Rand1{
	Random rand = new Random();
	
	public void go1() {
		int result = rand.nextInt(9+1);		// 0~9 랜덤
		System.out.println(result);
	}
	public void go4() {
		int result = rand.nextInt(4+1);		// 0~4 랜덤
		System.out.println(result);
	}
	

	public void go2() {
		int result = (int)(Math.random()*6);
		System.out.println(result);
	}
	
	public void go3() {
		int result = rand.nextInt(6)+100;		// 100-105
		System.out.println(result);
	}
}

class Rand2{
	public void go1() {
		int result = (int)(Math.random()*10);		// 0~9랜덤
		System.out.println(result);
}
}