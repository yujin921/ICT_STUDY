package Chapter08.Class;

class Student{
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	//인스턴스 생성자
	public  Student() {
		serialNum++;
		studentID = serialNum;
	}
}
public class StaticTest {
	public static void main(String[] args) {
		int a = Student.serialNum;
		System.out.println(a);
		
		Student studentLee = new Student();
		System.out.println("학번 : " + studentLee.serialNum);
		
		Student studentSon = new Student();
		System.out.println("학번 : " + studentSon.serialNum);
	}

}
