package Chapter14.collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class User{
    String id;
    String pw;
    String name;
    String regDate;

    public User(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss"); 
        //simpledateformat 이용 (yyyy에 연도, mm에 월, dd는 일, a는 오전오후, hh는 시간, mm은 분, ss는 초
        this.regDate = dateFormat.format(today); //regdate에 값 넣기
    }
}

class User_Info_method{
	Scanner scan = new Scanner(System.in);
    public void show(){
        System.out.println("*** User 정보 확인 프로그램 ***");
        System.out.println("1. 회원 가입 \n2. 회원 조회 \n3. 전체 조회 \n0. 종료");
        System.out.print("> 번호를 입력하세요 : ");

    }
    
    //userMap이라는 Hashmap에 값 만들기
    public void addUser(HashMap<String, User> userMap, String id, String pw, String name){
    	if(userMap.containsKey(id)){
            System.out.println("이미 존재하는 아이디입니다."); //id가 이미 존재하면 중복방지 오류
        } else{
            userMap.put(id,new User(id,pw,name));
            System.out.println(id +"님, 가입을 축하합니다."); //id를 키값으로 user라는 hashmap을 value값으로 만들기
        }
    }

    public void checkUser(HashMap<String,User> userMap, String id, String pw){
        if(userMap.containsKey(id)){
            User user = userMap.get(id);//key에 상응하는 value 값 가져오기
            if(user.pw.equals(pw)){
                System.out.println("--- 회원 조회 결과 ---");
                System.out.println("ID : " +id + " Name : " + user.name + " Reg_Date : " + user.regDate);
            } else{
                System.out.println("비밀번호가 일치하지 않습니다. ");
            }
        }else{
            System.out.println("일치하는 회원 정보가 없습니다.");
        }
    }
    
    public void allUser(HashMap<String, User> userMap) {
    	List<String> idList = new ArrayList<>(userMap.keySet());
    	Collections.sort(idList);
    	System.out.println("--- 전체 조회 결과 ---");
    	for(String id : idList) {
    		User user = userMap.get(id);
    		System.out.println("ID : " + user.id + " Name :" + user.name + " Reg_Date : " + user.regDate);
    	}
    }
}

public class User_Info_main{
    public static void main(String[] args){
        User_Info_method use = new User_Info_method();
        HashMap<String, User> userMap = new HashMap<>();
        boolean close = false;
        String id = null;
        String pw = null;
        String name = null;
        Scanner scan = new Scanner(System.in);
        while(close == false){
            use.show();
            int num = scan.nextInt();
            switch(num){
                case(1):
                	System.out.print("> ID : ");
                	id = scan.next();
                	System.out.print("> PW : ");
                	pw = scan.next();
                	System.out.print("> Name : ");
                	name = scan.next();
                	use.addUser(userMap, id, pw, name);
                	break;
                case(2):
                	System.out.print("> 조회할 ID : ");
                	id = scan.next();
                	System.out.print("> PW 확인 : ");
                	pw = scan.next();
                	use.checkUser(userMap, id, pw);
                	break;
                case(3):
                	use.allUser(userMap);
                	break;
                case(0):
                	close = true;
                	System.out.println("프로그램을 종료합니다");
                	scan.close();
                	break;
                default :
                	System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                	
            }
        }
    }
}