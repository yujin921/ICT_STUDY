package Chapter13.genetic;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(4,5,2));
		ArrayList<Integer> arNum3 = new ArrayList<>(Arrays.asList(1,2));

		//addAll - 합집합
		System.out.println("합집합 => ");
		ArrayList<Integer> arNumAdd = new ArrayList<>(arNum);
		
		for(Integer i : arNumAdd) {
			System.out.println(i + " ");
		}
		
		//removeAll - 차집합
		System.out.println("차집합 => ");
		ArrayList<Integer> arNumRemove = new ArrayList<>(arNum);
		arNumRemove.remove(arNum2);
		for (int i = 0; i< arNumRemove.size(); i++) {
			System.out.println(arNumRemove.get(i)+" ");
		}
		
		
		//retainAll - 교집합
		System.out.println("\n교집합 => ");
		ArrayList<Integer> arNumRetain = new ArrayList<>(arNum);
		arNumRetain.retainAll(arNum2);
		for(Integer i : arNumRetain) {
			System.out.println(i+" ");
		}
		
		//containsAll - 부분집합
		System.out.println("\n부분집합 => ");
		ArrayList<Integer> arNumContain = new ArrayList<>(arNum);
		if(arNumContain.containsAll(arNum3))
			System.out.println("부분집합 O");
		else
			System.out.println("부분집합 X");
 	}
}
