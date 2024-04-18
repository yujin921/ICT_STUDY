package Chapter04.Condition;

public class SwitchTest2 {
	public static void main(String[] args) {
		int ranking = 2;
		
		String medal = switch(ranking) {
		case 1 ->{
				System.out.println("축하축하");
				yield "금메달";
		}
		case 2->"은메달";
		case 3->"동메달";
		default -> "참가상";
		};
		System.out.println(medal +"을 수여합니다.");
	}
}