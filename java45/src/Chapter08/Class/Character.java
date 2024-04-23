package Chapter08.Class;

public class Character {

	//캐릭터 정보
	private String id; //아이디
	private String job; //직업
	private int level; //레벨
	private int str; //힘 스텟
	private int dex; //밑첩 스텟
	private int intel; //지능 스텟
	
	{
		this.level = 1;
		this.str = 1;
		this.dex = 1;
		this.intel = 1;
		
	}
	
	//생성자 단축키 : alt + shift + s + o
	public Character(String id, String job) {
		this.id = id;
		this.job = job;
	}

	public Character(String id, String job, int level, int str, int dex, int intel) {
		this.id = id;
		this.job = job;
		this.level = level;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
	}
	
	public void skill() {
		if(this.job.equals("마법사")) {
			System.out.println("스토밍");
		}else if(this.job.equals("전사")) {
			System.out.println("바람의 상처");
		}else if(this.job.equals("도적")) {
			System.out.println("그림자 수리검");
		}else {
			System.out.println("기본 공격");
		}
	}
	
	public String toString() {
		return String.format("[%s(%s) Lv%d]님의 스탯 : str(%d), dex(%d), intel(%d)", id,job,level,str,dex,intel);
				//[id(job) lvlebel]님의 스탯 : str(d),dex(d)
	}
}
