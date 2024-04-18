package Game;
import java.util.Random;
public class For_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		for(int i = 0; i<7;i++) {
			int a = ran.nextInt(26);
			char ch = (char)(65+a);
			System.out.print(ch + " ");
		}
	}

}
