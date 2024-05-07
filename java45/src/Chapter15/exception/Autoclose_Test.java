package Chapter15.exception;

class NetAccess implements AutoCloseable{
	public void open() { System.out.println("접속");}
	public void send() { System.out.println("전송");}
	
	@Override
	public void close() { System.out.println("해제");}
	
}

public class Autoclose_Test {
	public static void main(String[] args) {
		//try-with-resources
		try(NetAccess na = new NetAccess()){
			na.open();
			na.send();//close는 무조건 한 번 나옴
		} catch(Exception e) {
			
		}finally {
			System.out.println("프로그램 종료");
		}
		
	}
}
