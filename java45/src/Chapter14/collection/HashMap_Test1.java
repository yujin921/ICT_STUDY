package Chapter14.collection;

import java.util.HashMap;

public class HashMap_Test1 {
	public static void main(String[] args) {
		//HashMap - hash구조를 갖으며 key, vaule를 쌍으로 저장
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어 땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 450);
		snack.put("빼빼로", 900);
		
		String mySnack = "죠리퐁";
		System.out.println(mySnack + "의 가격은 "+ snack.get(mySnack));
		
		snack.remove("빼빼로"); //kEY와 일치하는 데이터 삭제
		System.out.println("빼빼로");
		snack.replace("죠리퐁", 3000); //해당 key에 일치하는 value 수정
		System.out.println(snack.get("죠리퐁"));
		System.out.println(snack.isEmpty());
		
		
	}
}
