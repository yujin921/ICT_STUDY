package Chapter06.Array;

public class ShallowCopy {
	public static void main(String[] args) {
		//얕은 복사
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = bookArray1; //얕은 복사

		bookArray1[0] = new Book("태백산맥","조정래");
		bookArray1[1] = new Book("데미안","헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가","유시민");
		
		//system 클래스의 arraycopy() 메서드
		//System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치, 복사할 요소 개수)
		System.arraycopy(bookArray1,0,bookArray2,0,3); //주로 따지면 깊은 복사
		
		System.out.println("주소값1 : "+ bookArray1);
		System.out.println("주소값2 : "+ bookArray2);
		System.out.println("주소값3 : "+ bookArray3);

		for(int i =0; i<bookArray2.length; i++) {
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
		
		
		
		System.out.println("");
		System.out.println("===== bookArray3 =====");
		for(int i=0; i<bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
			System.out.println(bookArray3[i]);
		}
	}
}
