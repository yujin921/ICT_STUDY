package Chapter11.interface_part;


abstract sealed class Language permits Java, Cpp, CSharp{}
//permits 키워드 뒤에 해당 클래스를 상속받을 sub class 선언
//sealed 된 클래스를 활용하기 위해서 같은 모듈 혹은 같은 패키지
final class Java extends Language{}
//final class Cpp extends Language{}
//final class CSharp extends Language{}
//final class Python extends Language{} //상속제한

//final class OpenJava extends Java{} //상속제한 - final 때문에

sealed class Cpp extends Language permits C11, C20{}
non-sealed class CSharp extends Language{}

final class C11 extends Cpp{}
final class C20 extends Cpp{}
//final class C30 extends Cpp{} //상속제한


final class CCSharpCore extends CSharp{} //상속제한 X
final class CSharpCore2 extends CSharp{}
public class Abstract_Sealed {
	public static void main(String[] args) {
		Language lang_java = new Java();
		outLanguageName(lang_java);
/*
 	상속제한
 	final : 더이상 파생할 수 없다
 	sealed : 저장한 후손에 대해서만 파생을 허가
 	non-sealed : 제한없이 파생시킬 수 있다.
 	
 */
		
	}
	
	public static void outLanguageName(Language lang) {
		if(lang instanceof Java) {
			System.out.println("자바");
		}else if (lang instanceof Cpp) {
			System.out.println("C++");
		}else if (lang instanceof CSharp) {
			System.out.println("C#");
		}
	}
}
