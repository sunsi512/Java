package day13;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	public static void main(String[] args) {
		HMap1 hm1 = new HMap1();
		MyDictionary md = new MyDictionary();
		md.go();
	}
}

class HMap1{
	public void go() {
		HashMap<String, Double> hm1 = new HashMap<>();
		
		// 추가 put
		hm1.put("일", 1.0);
		hm1.put("이", 2.0);
		hm1.put("삼", 3.0);
		hm1.put("사", 4.0);
		hm1.put("요건따로", 55.1);
		
		// get 읽기
		// System.out.println(arr1.get(0));
		System.out.println(hm1.get("일"));
		System.out.println(hm1.get("이"));
		System.out.println(hm1.get("삼"));
		System.out.println(hm1.get("사"));
		System.out.println(hm1.get("요건따로"));
		
		if(hm1.containsKey("사")) {			// containsKey : 해당하는 키워드를 갖고있는지 검사
			System.out.println(hm1.get("사"));
		}
	}
}

class MyDictionary{
	// 나만의 사전 만들기
	private String search;
	public void go() {
		HashMap<String, String> hm1 = new HashMap<>();
		
		// put 사전 항목을 추가
		hm1.put("사과", "apple");
		hm1.put("오렌지", "orange");
		hm1.put("바나나", "banana");
		
		System.out.println("영어로 변환할 단어를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		search = sc.nextLine();
		if(hm1.containsKey(search)) {
			System.out.println(hm1.get(search));
		}else
			System.out.println("아직 추가되지 않은 단어입니다.");
	}
}

// Map : 사전
// ArrayList : {1,2,3,4}
// Map : {"키워드":"값", "키워드2":"값2"};

