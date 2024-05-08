package Chapter16.ioStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IoStream_encoding2 {
	public static void main(String[] args) throws Exception{
		FileInputStream fi = new FileInputStream("애국가.txt");
		InputStreamReader in = new InputStreamReader(fi,"euc-kr");
		//한 문장씩 읽기
		FileReader in2 = new FileReader("애국가.txt");
		int ch;
		for(;;) {
			ch = in.read();
			if(ch == -1) break;
			System.out.print((char)ch);
		}
		in.close();
		System.out.println();
		
		
		/*char[] text = new char[100];
		int num = in.read(text);
		System.out.println(text);
		in.close();*/
	}
}
