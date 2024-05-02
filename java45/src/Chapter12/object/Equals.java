package Chapter12.object;

public class Equals {
	public static void main(String[] args) {
		User userA = new User(100,"이상원");
		User userB = userA;
		User userC = new User(100,"이상원dlek");
		
		if(userA == userB) { //동일성 비교
			System.out.println("userA와 userB의 주소는 같다. 1");
		}else {
			System.out.println("userA와 userB의 주소는 다르다. 2");
		}
		
		if(userA.equals(userB)) {//동등성 비교
			System.out.println("userA와 userB는 같다. 3");
		}else {
			System.out.println("userA와 userB는 다르다. 4");
		}
		
		
		if(userA == userC) { //동일성 비교
			System.out.println("userA와 userC의 주소는 같다. 5");
		}else {
			System.out.println("userA와 userC의 주소는 다르다. 6");
		}
		
		if(userA.equals(userC)) {//동등성 비교
			System.out.println("userA와 userC는 같다. 7");
		}else {
			System.out.println("userA와 userC는 다르다. 8");
		}
	}
}
