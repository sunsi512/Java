package day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stream3 {
	public static void main(String[] args) {
		MyProgram mp = new MyProgram();
		mp.go("C:\\Users\\Administrator\\Desktop\\scan.txt");
	}
}

class MyProgram{
	
	Scanner sc = new Scanner(System.in);
	String msg = "";
	
	public void go(String file) {
		FileOutputStream fout = null;
		// 스캐너를 통해서 입력받은 문자열을
		// 바탕화면의 scan.txt에 기록(로그남기기)
		try {
			fout = new FileOutputStream(file,true);
			System.out.println("내 메시지 >> ");
			msg = sc.nextLine();
			System.out.println(msg);
			byte[] byteArray = msg.getBytes();
			fout.write(byteArray);
			System.out.println("입력완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입력실패");
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}