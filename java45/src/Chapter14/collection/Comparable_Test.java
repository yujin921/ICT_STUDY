package Chapter14.collection;

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member>{
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Member m) {
		return (this.name.compareTo(m.name));
	}
	
	
}


public class Comparable_Test {
	public static void main(String[] args) {
		//정렬에 대한 비교
		// Comparable : 자기 자신과 비교 
		// Comparator : 서로 다른 두 객체를 비교
		
		Set<Member> set = new TreeSet<>();
		set.add(new Member("홍길동",20));
		set.add(new Member("강감찬",50));
		set.add(new Member("이순신",35));
		
		for (Member m : set) {
			System.out.println(m);
		}
	}
}
