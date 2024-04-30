package Example;
/*
 * seoul45_game
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

//도적
public class Thief extends Novice implements Skill{

	//명시적 생성자
	//Thief형 인스턴스 생성시 Novice의 명시적 생성자를 호출하여 각각의 초기값을 가지는 인스턴스 생성
	public Thief(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	//상위 클래스 Novice의 attack()메서드를 재정의(오버라이드)
	@Override
	public void attack() {
		System.err.println("치명적인 공격");
	}

	//interface Skill의 메서드 skill()를 구현한다. (오버라이드) 
	@Override
	public void skill() {
		System.err.println("중독");
	}
	
}
