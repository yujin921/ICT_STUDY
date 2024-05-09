package Chapter17.innerclass;

interface Human6{
	void intro();
}

class Anonymous implements Human6{
	@Override
	public void intro() {
		System.out.println("나는 학생입니다.");
	}
}


public class AnonymousClass2 {
	public static void main(String[] args) {
		Human6 lee = new Human6() {
			@Override
			public void intro() {
				System.out.println("저는 학생이에요.");
			}
		};
		lee.intro();
	}
}
