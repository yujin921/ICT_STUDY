package Chapter09.Inheritance;

class Tool{
	String name;
	
	Tool(String name){
		this.name = name;
	}
}

class Human5{
	Tool tool; //멤버 변수를 클래스로 가진다
	
	Human5(String toolName){
		this.tool = new Tool(toolName);
	}
	
	void use() {
		System.out.println(tool.name + "을/를 사용한다");
	}
}


public class Has_a {
	public static void main(String[] args) {
		Human5 h = new Human5("파이어스힐");
		System.out.println(h.tool.name);
		h.use();
	}
}
