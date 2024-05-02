package Chapter12.object;

public class String2 {
	public static void main(String[] args) {
		//length
		String str = "아름다운 우리나라";
		System.out.println("길이 : " + str.length());
		System.out.println("두번째 문자 : " +str.charAt(2));
		System.out.println();
		
		//indexof
		String str2 = "String Search Method of String Class";
		System.out.println("앞쪽 t = " + str2.indexOf('t'));
		System.out.println("뒤쪽 t = " + str2.lastIndexOf('t'));
		System.out.println("앞쪽 z = " + str2.indexOf('z'));
		System.out.println("앞쪽 String " + str2.indexOf("String"));
		System.out.println("뒤쪽 String " + str2.lastIndexOf("String"));

		//startwith, endwith
		String str3 = "girl.jpg";
		System.out.println(str3.startsWith("g"));
		System.out.println(str3.endsWith(".jpg"));
		
		//changeCase
		String str4 = "Kim Sang Hyung";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		
		//문자열 자체를 변경하지 않는다.
		str4.toUpperCase();
		System.out.println(str4);
		
		//변경하려면 다시 대입받아 저장한다.
		str4 = str4.toUpperCase();
		System.out.println(str4);
		
		//trim
		String str5 = "    Kim Sang Hyung    ";
		System.out.println(str4.trim());
		System.out.println(str5.trim().concat(" BABO "));
		System.out.println();
		
		//replace
		String str6 = "독도는 일본땅, 대마도는 일본땅";
		System.out.println(str6.replace("일본", "한국"));
		System.out.println(str6.replaceFirst("일본", "한국"));
		System.out.println();
		
		//substring
		String str7 = "0123456789";
		System.out.println(str7.substring(3));
		System.out.println(str7.substring(3,7));
		System.out.println();
		
		//split
		String city = "서울,대전,대구,부산";
		String[] token = city.split(",");
		for(String s: token) {
			System.out.println(s);
		}
		System.out.println();
		
		//join
		String path = String.join("/", "user","data","app","local");
		System.out.println(path);
	}
}
