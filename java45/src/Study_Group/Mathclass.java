package Study_Group;

import java.util.Random; //Random 클래스는 꼭 import 해줘야함

public class Mathclass {
	public static void main(String[] args) {
		//Math 클래스 사용
		System.out.println("난수 발생 : " + Math.random());
		System.out.println("랜덤 숫자 : " + (int)Math.random()*4);
		
		//Random 클래스 사용
		Random random = new Random();
		System.out.println(random.nextInt(10)); //n 미만의 랜덤 정수 리턴
	}
}
