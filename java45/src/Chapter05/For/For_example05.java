package Chapter05.For;

public class For_example05 {
	public static void main(String[] args) {
		System.out.println("1번");
		for(int i = 1; i<=5; i++) {
			for(int j= 1;j<=5;j++) {
				if(i==j) {
					System.out.print(i+" ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("\n2번");
		for(int i=1; i<=5; i++) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
