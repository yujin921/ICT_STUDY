package Chapter17.innerclass;

class AA{ //AA는 BB의 외부 클래스
	int i = 100;
	BB b = new BB();
	
	
	//AA의 멤버에 접근이 용이해짐, AA에서만 사용될거라면
	//불필요한 부분이 밖으로 드러나지 않으므로 "캡슐화"
	class BB{ //BB는 AA의 내부 클래스
		void method() {
			i += 100;
			AA a = new AA();
			System.out.println("=====");
			System.out.println(a.i);
			System.out.println(i);
		}
	}
	
	static class CC { //정적 내부 클래스
		void method() {
			
		}
	}
}

public class InnerClass_Test1 {
	public static void main(String[] args) {
		AA a = new AA();
		a.b.method();
		
		AA.BB b = a.b;
		b.method();
		
		AA.BB c = a.new BB();
		c.method();
		
		AA.BB d = new AA().b;
		d.method();
		
		AA.BB e = new AA().new BB();
		e.method();
		
		 //BB err1 = new BB();  //내부 클래스에 접근 불가
		 //AA.BB err2 = new AA.BB() //인스턴스 내부 클래스만 생성 불가
		AA.CC f = new AA.CC();
		f.method();
	}
}
