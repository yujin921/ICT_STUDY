package Chapter06.Array;

public class DeepCopy {
	public static void main(String[] args) {
		//깊은 복사
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("무진기행", "김승옥");
		bookArray1[2] = new Book("데미안", "헤르만 헤세");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===== bookArray1 =====");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			System.out.println(bookArray1[i]);
		}
		
		
		System.out.println("");
		System.out.println("===== bookArray2 =====");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			System.out.println(bookArray2[i]);
		}
	}

}