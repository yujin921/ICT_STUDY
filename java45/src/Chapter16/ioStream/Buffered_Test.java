package Chapter16.ioStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffered_Test {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(
				new FileReader("애국가-Utf8nb.txt"));
		
		/*char[] text = new char[100];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
		*/
		int data;
		for(;;) {
			data = in.read();
			if(data == -1) break;
			System.out.println((char) data);
		}
		in.close();
	}
}
