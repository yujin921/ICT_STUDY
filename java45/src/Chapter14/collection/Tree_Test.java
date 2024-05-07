package Chapter14.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Test {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "부산");
		treeMap.put(2, "인천");
		treeMap.put(3, "대구");
		treeMap.put(4, "대전");
		treeMap.put(5, "광주");
		treeMap.put(6, "울산");
		
		int size = treeMap.size();
		System.out.println(size); //저장된 총 요소 수
		
		//객체찾기
		Object object = treeMap.get(1);
		System.out.println(object);
		
		//key를 요소로 가지는 SET 생성
		Set<Integer> keySet = treeMap.keySet();
		System.out.println(keySet);
		
		
		//value 값 읽기
		Iterator<Integer> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			String value = treeMap.get(key);
			System.out.println("키: "+ key + ", 값: " + value);
		}
		
		treeMap.remove(1); //index가 아니라 key값이 1인 데이터 삭제
	}
	
}
