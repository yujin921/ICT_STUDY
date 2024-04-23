package Chapter08.Class;

public class Game_example {
	public static void main(String[] args) {
		Character cha1 = new Character("중곡동휘발유", "도적");
		System.out.println(cha1);
		
		Character cha2 = new Character("퇴계원장미칼","마법사",4,10,14,4);
		System.out.println(cha2);
		cha2.skill();
	}
	
	
}
