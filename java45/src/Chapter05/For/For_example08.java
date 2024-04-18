package Chapter05.For;

public class For_example08 {
	public static void main(String[] args) {
		/*System.out.println("1번");
		for(int i=0; i<5; i++) {
			for(int j=4; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		//교수님
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n2번");
		/*for(int i=0; i<5;i++) {
			for(int j=0; j<i;j++ ) {
				System.out.print(" ");
			}
			for(int k=9; k>2*i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		//교수님
		for(int i=5; i>=1; i--) {
			for(int j=5-i; j>0;j--) {
				System.out.print(" ");
			}
			for(int k=2*i-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
