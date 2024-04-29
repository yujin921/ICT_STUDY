package Chapter11.interface_part;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		
		boolean inside = true;
		boolean create = false;		
		Novice novice = new Novice();
		Menu menu = new Menu();
		Scanner scan = new Scanner(System.in);
		
		while(inside) {
			menu.OpenMenu();
			int num = scan.nextInt();
			switch(num) {
				case 1:
					novice.Novice_create();
					novice.St();
					create = true;
					break;
				case 2:
					if(create == false) {
						System.out.println("캐릭터를 생성하세요.");
					}else {
						novice.CharacterInfo();
					}
					break;
				case 3:
					if(create == false) {
						System.out.println("캐릭터를 생성하세요.");
					}else {
						novice.ChoiceJob();
					}
					break;
				case 4:
					if(create == false) {
						System.out.println("캐릭터를 생성하세요.");
					}else {
						novice.BasicAttack();
					}
					break;
				case 5:
					if(create == false) {
						System.out.println("캐릭터를 생성하세요.");
					}else {
						novice.Skill();
					}
					break;
				case 0:
					inside = false;
					System.exit(0);
			}
		}
		scan.close();
	}
}
