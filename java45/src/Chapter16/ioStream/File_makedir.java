package Chapter16.ioStream;

import java.io.File;
import java.io.FileWriter;

public class File_makedir {
	public static void main(String[] args) throws Exception {
		File folder = new File("C://TestFolder");
		if(folder.mkdir()) {
			File file = new File("C://TestFolder//MyFile.txt");
			if(file.createNewFile()) {
				FileWriter out = new FileWriter(file);
				out.write("테스트 입니다 123");
				out.close();
			}
		}
	}
}
