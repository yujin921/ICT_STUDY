package Chapter16.ioStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoStream_filecopy {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("복사 시작");
		
		
		FileInputStream src = new FileInputStream("애국가-Utf8nb,txt");
		FileOutputStream dest = new FileOutputStream("test2.txt");
		/*
		BufferedInputStream src = new BufferedInputStream(
				new FileInputStream("애국가-Utf8nb.txt"));
		BufferedOutputStream dest = new BufferedOutputStream(
				new FileOutputStream("test2.txt"));
		*/ //Bufferedinputstream이 더 효율이 좋음
		int data;
		for(;;) {
			data = src.read();
			if(data == -1) break;
			dest.write(data);
		}
		src.close();
		dest.close();
		System.out.println("복사 완료");
		System.out.println(
		(System.currentTimeMillis() - start)/1000.0 + "초 걸림"
		);
	}
}
