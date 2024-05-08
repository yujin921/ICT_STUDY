package Chapter16.ioStream;

import java.io.File;

public class File_Info {
	public static void main(String[] args) {
		File f = new File("C://TestFolder//fileTest.txt");
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("파일입니다.");
				System.out.println("파일 경로 : " + f.getParent());
				System.out.println("파일 경로2 : " + f.getPath());
				System.out.println("파일 이름 : " + f.getName());
				System.out.println("파일 크기 : " + f.length());
				System.out.println("숨김 파일 : " + f.isHidden());
				System.out.println("절대 경로 : " + f.isAbsolute());				
			} else if (f.isDirectory()) {
				System.out.println("디렉터리 입니다.");
			}
		} else {
			System.out.println("파일이 없습니다. ");
		}
	}
}
