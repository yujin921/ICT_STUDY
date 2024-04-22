package Chapter08.Class;

import java.time.LocalTime;

public class Class_basic4 {
/*	
 	필드, 속성, 멤버변수의 초기화 순서
 	1. 클래스 변수 : 기본값 > 명시적 초기화 > 클래스 초기화 블록
 	2. 인스턴스 변수 : 기본값 > 명시적 초기화 > 인스턴스 초기화 블록 > 
 */
	int num_temp =1; //명시적 초기화
	
	static final int num = 999; //클래스 변수
	
	//인스턴스 변수
	boolean am;
	int hour;
	int minute;
	int second;
	
	//클래스 초기화 블럭
	static {
		System.out.println("static 초기화 블럭");
	}
	
	//인스턴스 초기화블럭
	{
		System.out.println("instance 초기화 블럭");
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		if(hour >= 12) {
			hour -= 12;
			am = false;
		}else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
	
	
	public Class_basic4(boolean am, int hour, int minute) {
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}



	public Class_basic4(int hour, int minute) {
		this.am = hour <12; //boolean 타입
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}

	void whatTime() {
		System.out.println(am ? "오전" : "오후");
		System.out.println(hour + "시 " + minute + "분 "+ second + "초");
	}


	Class_basic4(){} //기본 생성자
	
}
