package Chapter14.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

class MyComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2)
	{
		return p1.name.compareTo(p2.name); // 역순 * -1
	}
}
public class Comparator_Test {

	public static void main(String[] args) {
		Set<Person> set1 = new TreeSet<>( new MyComparator());
	
		set1.add(new Person("홍길동",50));
		set1.add(new Person("강감찬",80));
		set1.add(new Person("이순신",45));
		
		for (Person p : set1) {
			System.out.println(p);
		}
		
		Set<Person> set2 = new TreeSet<>( new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person  p2) {
				return p1.name.compareTo(p2.name);
			}
		});
		
		set2.add(new Person("홍길동",50));
		set2.add(new Person("강감찬",80));
		set2.add(new Person("이순신",45));
		
		for (Person p : set1) {
			System.out.println(p);
		}
	}
}
