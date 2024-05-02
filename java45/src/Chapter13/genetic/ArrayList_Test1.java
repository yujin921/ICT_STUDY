package Chapter13.genetic;

import java.util.ArrayList;

public class ArrayList_Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2,5); //index 2에 5의 값을 추가
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		
		System.out.println();
		list.remove(0); //index 0의 값을 제거
		for(Integer i : list) {
			System.out.println(i+" ");
		}
		System.out.println();
		//index 1의 요소 리턴
		System.out.println("get(index): " + list.get(1));
		//list 사이즈 리턴
		System.out.println("size(): " + list.size());
	}
}
