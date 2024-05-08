package Chapter16.ioStream;

import java.io.FileInputStream;

public class IoStream_in1 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");
		int avail = in.available(); //스트림에서 읽을 수 있는 바이트 개수 리턴
		byte[] data = new byte[avail];
		in.read(data); //지정된 배열 크기만큼 읽고 버퍼 배열에 저장, 읽은 개수 리턴
		in.close(); //스트림 닫고 자원해제
		for(byte b : data) {
			System.out.print(b);
		}
	}
}
