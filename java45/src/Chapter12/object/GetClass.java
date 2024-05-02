package Chapter12.object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClass {
	public static void main(String[] args) {
		Human kim = new Human(29,"김상형");
		
		Class cls = kim.getClass();
		System.out.println("클래스 이름 : " + cls.getName());
		System.out.println("슈퍼 클래스 : " + cls.getSuperclass().getName());
		
		System.out.print("필드 : ");
		Field[] fields = cls.getDeclaredFields();
		
		for(Field f : fields) {
			System.out.println(f.getName() + " ");
		}
		
		System.out.print("\n메서드 : ");
		Method[] methods = cls.getDeclaredMethods();
		
		for(Method m : methods) {
			System.out.println(m.getName() + " ");
		}
	}
}
