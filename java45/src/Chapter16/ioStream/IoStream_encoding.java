package Chapter16.ioStream;

import java.io.FileReader;

public class IoStream_encoding {
	public static void main(String[] args) throws Exception {
//		FileReader in = new FileReader("애국가.txt");
//		FileReader in = new FileReader("애국가-Unicode.txt");
//		FileReader in = new FileReader("애국가-Utf8.txt");
		FileReader in = new FileReader("애국가-Utf8nb.txt");
		
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = "  + num);
		System.out.println(text);
		in.close();
	}
}
