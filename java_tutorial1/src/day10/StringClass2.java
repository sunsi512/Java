package day10;

public class StringClass2 {
	public static void main(String[] args) {
		String info1 = "STAname=A01price=001000num=02ED";
		String info2 = "STAname=A02price=001500num=04ED";
		String info3 = "STAname=E01price=002500num=04ED";
		Quiz2 q2 = new Quiz2();
		q2.go(info2);			// 카페라떼 4잔 주문, 6000원
		q2.go(info3);			// 오렌지주스 4잔 주문, 10000원
	}
}

class Quiz2{
	
	public void go(String info) {
		String name ="";
		int idxName = info.indexOf("name=");
		String menuCode = info.substring(idxName+5 , idxName+8);
		String menuName = null;
		if(menuCode.equals("A01")) {
			menuName = "에스프레소";
		}
		else if(menuCode.equals("A02")) {
			menuName = "아메리카노";
		}
		else if(menuCode.equals("A03")) {
			menuName = "카푸치노";
		}
		else if(menuCode.equals("A04")) {
			menuName = "카페라뗴";
		}
		else if(menuCode.equals("E01")) {
			menuName = "오렌지주스";
		}
		// 수량 위치 찾고
		// 수량자르고
		// 수량은 Integer.parseInt()
		idxName = info.indexOf("num=");
		String numCode = info.substring(idxName+4, idxName+6);
		int num = Integer.parseInt(numCode);
		
		idxName = info.indexOf("price+");
		String priceCode = info.substring(idxName+6, idxName+12);
		// System.out.println(priceCode);
		int price = Integer.parseInt(priceCode);		// 개당 가격
		// 총 가격은 가격*수량
		// syso()
		
		System.out.println(menuName+" "+num+"잔 주문, "+price*num+"원");
	}
	
	
}