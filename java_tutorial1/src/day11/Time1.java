package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time1 {
	public static void main(String[] args) {
		NowTime nt = new NowTime();
		nt.go2();
		
	}
}

class NowTime{
	public void go() {
		//main
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf1.format(date));
	}

public void go2() {
	// 내일은 2022년 7월 31일
	// Integer.parseInt로 문자열은 정수로 바꿔서 더하기
	Calendar cal1 = Calendar.getInstance();
	Date date = cal1.getTime();
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
	String time = sdf2.format(date);
	String ym = time.substring(0,9);
	String day = time.substring(10,12);
	System.out.println(ym+" "+(Integer.parseInt(day)+1)+"일");
}
}