package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		HM2 h = new HM2();
		Nations n = new Nations();
		n.go();
	}
}

class Nations{
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		// 수도 put
		hm.put("한국", "서울");
		hm.put("중국", "베이징");
		hm.put("일본", "도쿄");
		hm.put("미국", "워싱턴");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("어느 나라 수도가 궁금하신가요?");
			System.out.println(hm.keySet());
			String str = sc.next();
			System.out.println(str+"의 수도는 "+hm.get(str));
			
			}
		}
	}


class HM2{
	public void go() {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("아메리카노", 1500);
		hm.put("카페라떼", 2500);
		hm.put("카페모카", 2500);
		hm.put("카라멜마끼아또", 3500);
		
		System.out.println(hm.containsKey("아메리카노"));
		System.out.println(hm.containsKey(2500));
		hm.remove("카라멜마끼아또");
		hm.get("아메리카노");
		System.out.println(hm.keySet());
		Set<String> keyset = hm.keySet();
		Iterator<String> it = keyset.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("메뉴 : "+key+"\t 가격 : "+hm.get(key));
		}
	}
}
