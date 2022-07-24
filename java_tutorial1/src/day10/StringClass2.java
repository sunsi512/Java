package day10;

public class StringClass2 {
	public static void main(String[] args) {
		String info1 = "STAname=A01price=001000num=02ED";
		String info2 = "STAname=A02price=001500num=04ED";
		String info3 = "STAname=E01price=002500num=04ED";
		Quiz2 q2 = new Quiz2();
		q2.go(info1);			// 에스프레소 2잔 주문, 2000원
		q2.go(info2);			// 카페라떼 4잔 주문, 6000원
		q2.go(info3);			// 오렌지주스 4잔 주문, 10000원
	}
}

class Quiz2{
	
	public void go(String info) {
		String name ="";
		int sta = info.indexOf('S');
		name = info.substring(sta+8, sta+11);
		System.out.println(name);
		
		if(name == A01)
	}
	
	
}