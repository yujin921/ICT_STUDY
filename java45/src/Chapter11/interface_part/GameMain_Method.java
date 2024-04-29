package Chapter11.interface_part;

import java.util.Random;
import java.util.Scanner;

/* seoul45_game
* 1. 프로그램이 실행되면 메뉴를 출력한다.
* 2. 메뉴는 (1.캐릭터 생성, 2.캐릭터 정보, 3.전직하기, 4.공격하기, 0.종료)
*    - (1.캐릭터 생성)을 선택한 경우, 이름과 스탯값을 초기값으로 하는 Novice(평민)클래스형 인스턴스를 생성한다.
*      스탯은 (힘, 민첩, 지능)이 있으며 각각 랜덤한 값을 가지고, 
*      형평성을 위해 스탯의 총 합이 15이상인 경우에만 저장되도록 하며,
*      사용자의 선택에 따라 해당 스탯을 저장 or 스탯 재부여 할 수 있도록 한다.
* 3. - (2.캐릭터 정보)를 선택한 경우, 생성된 캐릭터의 이름, 직업, 힘, 민첩, 지능을 출력한다.
* 4. - (3.전직하기)를 선택한 경우, 생성된 캐릭터의 정보를 초기값으로 가지는 
*      선택한 클래스에 해당하는 인스턴스를 생성하고 문구를 출력한다.
* 5. - (4.공격하기)를 선택한 경우, Attack()메서드를 호출하여 직업(인스턴스)에 따라 공격한다.
* 6. - (5.스킬사용)을 선택한 경우, Skill()메서드를 호출하여 직업(인스턴스)에 따라 스킬을 사용한다.
* 7. - (0.종료)를 선택한 경우, 프로그램을 종료한다.
* 8. - 종료를 선택하기 전까지 반복한다.
* */


class Novice {
	int str;
	int dex;
	int intel;
	String id;
	String job = "무직";
	String stcheck;
	boolean stat = false;
	Scanner scan = new Scanner(System.in);
	void Novice_create() {
		System.out.println("캐릭터를 생성합니다. ");
		System.out.print("사용하실 아이디를 입력해 주세요 : ");
		id = scan.nextLine();
	}
	
	void OpenMenu() {
		System.out.println("==== ABCDE_RPG ====");
		System.out.println("1. 캐릭터 생성 \n2. 캐릭터 정보 \n3. 전직하기 \n4. 기본 공격 \n5. 스킬 사용 \n0. 종료");
		System.out.println("=====================");
		System.out.print("번호를 선택하세요 : ");
	}
	
	void St() {
		while(stat == false) {
			Random rand = new Random();
			str = rand.nextInt(10)+1;
			dex = rand.nextInt(10)+1;
			intel = rand.nextInt(10)+1;
			int sum = str+dex+intel;
			if(sum>=15) {
				System.out.println("스탯을 부여합니다.");
				System.out.printf("부여된 스탯 정보 : 힘[%d], 민첩[%d], 지능[%d] \n",str,dex,intel);
				System.out.print("스탯을 다시 받으시겠습니까? (y/n) : ");
				stcheck = scan.nextLine();
				if(stcheck.equals("n")) {
					System.out.println("현재 정보로 저장합니다.");
					stat = true;
				}
			}
		}
		
	}
	
	void CharacterInfo() {
		System.out.printf("[ID : %s(%s), stat : 힘(%d), 민첩(%d), 지능(%d)] \n",
							id, job,str,dex,intel );
	}
	
	void BasicAttack() {
		System.out.println("기본 공격");
	}
	
	
	void ChoiceJob() {
		System.out.println("=== 직업 종류 === ");
		System.out.println("1. 기사 \n2. 도적 \n3. 마법사");
		System.out.print("전직할 직업의 번호를 선택하세요. : ");
		int jobchoice = scan.nextInt();
		if(jobchoice ==1) {
			job = "기사";
			System.out.println("기사로 전직합니다. ");
		}else if(jobchoice ==2) {
			job ="도적";
			System.out.println("도적으로 전직합니다. ");
		}else if(jobchoice ==3) {
			job = "마법사";
			System.out.println("마법사로 전직합니다. ");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	void Skill() {
		if(job == "기사") {
			System.out.println("강력한 배쉬 공격");
		}else if(job =="도적") {
			System.out.println("쇼크 스턴");
		}else if(job =="마법사") {
			System.out.println("매직 애로우 공격");
		}else if(job == "무직") {
			System.out.println("전직을 하지 않아 스킬을 사용할 수 없습니다.");
		}
	}
}
