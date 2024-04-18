package Chapter05.For;

public class For_example04 {
	public static void main(String[] args) {
		System.out.println("1번");
		for(int i = 0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("0 ");
			}
			System.out.println("");
		}
		
		System.out.println("\n2번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
		System.out.println("\n3번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");	
		}
	}
}
