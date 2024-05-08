package Chapter16.ioStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream_out {
	public static void main(String[] args) {
		byte[] data = {8,9,0,6,2,9,9};
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");
			out.write(data);
			System.out.println("Write success");
		} catch (IOException e) {
			System.out.println("File output error");
		} finally {
			try {
				out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
