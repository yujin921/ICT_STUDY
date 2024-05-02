package Chapter13.genetic;

import java.util.ArrayList;

record Student(String name, int stdNum) {}

public class ArrayList_Test3 {
	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(new Student("홍길동", 20241001));
		stList.add(new Student("이순신", 20241002));
		stList.add(new Student("강감찬", 20241003));

		for(int i=0; i<stList.size(); i++) {
			System.out.println(stList.get(i));
		}
	}
}
