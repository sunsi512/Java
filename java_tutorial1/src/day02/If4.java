package day02;

import java.nio.file.spi.FileSystemProvider;

public class If4 {
	public static void main(String[] args) {
		int 나이 = 20;
		if(나이 >= 20) {
			// 20 이상
			System.out.println("성인");
		}else if(나이 >= 14) {
			// 14이상 20미만
			System.out.println("청소년");
		}else if(나이 < 14) {
			// 14미만
			System.out.println("어린이");
		}else {
			System.out.println("그 밖에 나머지");
		}
		
		
		// 성적매기기
		int 점수 = 87;
		
		if(점수 >= 90) {
			System.out.println("A");
		}
		else if(점수 >= 80) {
			System.out.println("B");
		}
		else if(점수 >= 70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}
}
