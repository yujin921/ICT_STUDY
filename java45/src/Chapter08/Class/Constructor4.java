package Chapter08.Class;

class Product{
	static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo; // 인스턴스 고유 번호
	
	static int snum; //클래스 초기화, 클래스 변수
	static int num = 1; //명시적 초기화, 인스턴스 변수
	
	//클래스 초기화 블럭 -> 무조건 1번
	/*클래스 초기화 블럭 : 클래스가 처음 로드될 때 한 번만 실행
					  정적 멤버 변수 (static 변수)의 초기화에 사용
					  클래스 초기화 블럭은 클래스가 메모리에 로드되는 시점에 실행되며, 한 번만 실행
					  클래스 내부에 static { ... } 형태로 작성됩니다.*/
	static {
		snum = 999;
		System.out.println("static : " + snum);
	}
	
	//인스턴스 초기화 블럭
	/*인스턴스 초기화 블럭 : 각 인스턴스가 생성될 때마다 실행
			           인스턴스 멤버 변수의 초기화에 사용
					   인스턴스 초기화 블럭은 객체가 생성될 때마다 실행되며, 생성자보다 먼저 실행

/*주요 차이점:
DF
실행 시기: 클래스 초기화 블럭은 클래스가 처음 로드될 때 한 번 실행, 인스턴스 초기화 블럭은 각 인스턴스가 생성될 때마다 실행
작업 범위: 클래스 초기화 블럭은 정적 멤버 변수의 초기화에 사용, 인스턴스 초기화 블럭은 인스턴스 멤버 변수의 초기화에 사용*/
	{
		count++; //++count;를 한 이유는?
		serialNo = count;
	}
	
	//기본생성자 -> 공유되는 변수가 아니니까 -> p1,p2,p3의 num값은 서로 영향을 주지 않는다.
	Product(){
		num++; //만약 p1, p2, p3의 값이 서로 영향을 받으려면 num값을 static int num으로 변경
	}
}
public class Constructor4 {
	public static void main(String[] args) {
		Product p1 = new Product();
		
		
		
		System.out.printf("p1의 제품번호(serialNo)는 %d", p1.serialNo);
		System.out.print("num = "+p1.num);
		Product p2 = new Product();
		System.out.printf("\np2의 제품번호(serialNo)는 %d", p2.serialNo);
		System.out.print("num = "+p2.num);
		Product p3 = new Product();
		System.out.printf("\np3의 제품번호(serialNo)는 %d", p3.serialNo);
		System.out.print("num = "+p3.num);
		System.out.printf("\n생산된 제품 총수는 %d개", Product.count);

	}

}
