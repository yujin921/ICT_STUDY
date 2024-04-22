package Chapter06.Array;
//다시 올리기
public class Array_test {
	public static void main(String[] args) {
		// Person 배열 선언 및 생성
		Person[] pArray = new Person[3]; 
		// 각 배열의 방에 새로은 Person 객체를 생성하여 초기화
		pArray[0] = new Person(10, "Soft"); 
		pArray[1] = new Person(20, "Engineer"); 
		pArray[2] = new Person(30, "Society"); 
		// 배열의 인덱스를 이용해서 값을 참조할 수 있다. 
		System.out.println(pArray[0].name+pArray[1].name+ pArray[2].name); 
		// 배열의 lenth 속성을 이용해서 배열을 순회할 수 있다. 
		for (int i = 0; i < pArray.length; i++)
		System.out.println(pArray[i].printAll()); 
	}
}

class Person { 
	int age; 
	String name; 
	public Person(int newAge, String newName) { 
		age = newAge; 
		name = newName; 
	}
	public String printAll() { 
		return "Person [age=" + age + ", name=" + name + "]"; 
	}
}

		