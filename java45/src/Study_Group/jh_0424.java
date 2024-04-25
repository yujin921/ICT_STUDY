package Study_Group;

class MovieTicket {

   public String reservationId;
   public String customerName;
   public String date;
   public String movieName;
   public String time;
   public String seat;
   public String price;
   
   public MovieTicket(String reservationId, String customerName,
         String date, String movieName, String time, 
         String seat, String price) {
      this.reservationId = reservationId;
      this.customerName = customerName;
      this.date = date;
      this.movieName = movieName;
      this.time = time;
      this.seat = seat;
      this.price = price;
   }
   
   public void megaboxCoex() {
      System.out.println("예약 ID : " + reservationId);
      System.out.println("고객 이름 : " + customerName);
      System.out.println("예약 날짜 : " + date);
      System.out.println("영화 제목 : " + movieName);
      System.out.println("상영 시간 : " + time);
      System.out.println("좌석 번호 : " + seat);
      System.out.println("예약 가격 : " + price);
   }
}


public class jh_0424 {
   public static void main(String[] args) {
      MovieTicket mt = new MovieTicket("TK20221010", "김철수",
            "2022년 10월 10일", "슈퍼히어로", "19:00",
            "C12", "12000원");

            mt.megaboxCoex();
   }

}