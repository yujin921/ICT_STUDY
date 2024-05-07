package Chapter14.collection;

import java.util.LinkedList;

public class LinkedList_Test2 {
	public static void main(String[] args) {
		LinkedList<String> arName = new LinkedList<>();
		//추가
		arName.add("장보고");
		arName.add("김유신");
		arName.add("강감찬");
		arName.add("을지문덕");
		arName.add("곽재우"); //LinkedList 맨 뒤에 추가
		arName.add("이순신"); //LinkedList 맨 앞에 추가
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		System.out.println("\n=================================");
		
		
		//검색
		System.out.println(arName.size()); //저장된 객체의 개수 반환
		System.out.println(arName.isEmpty()); //리슽트가 비어있는지 확인
		System.out.println(arName.indexOf("강감찬")); //지정된 객체가 저장된 위치를 반환
		System.out.println(arName.get(3)); //지정된 위치에 저장된 객체 반환
		
		//변경
		arName.set(0, "광개토대왕");
		for(String name : arName) {
			System.out.print(name + " ");
		}
		System.out.println("\n=================================");
		
		
		//제거
		arName.removeFirst(); //첫번째 노드 제거
		arName.removeLast(); //마지막 노드 제거
		arName.remove(2); //index 위치 객체 제거
		arName.remove("을지문덕"); //지정된 객체 제거
		for(String name : arName) {
			System.out.print(name + " ");
		
		
		}
	}
}