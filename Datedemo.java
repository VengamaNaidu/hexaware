import java.util.Date;
import java.time.LocalDate;

public class Datedemo{
 public static void main(String[] args){
  Date d=new Date();
System.out.println("Date is : "+ d);
System.out.println("Month is : "+ d.getMonth());
System.out.println("date is : "+ d.getDate());
System.out.println("Day is : "+ d.getDay());
System.out.println("Hours is : "+ d.getHours());
System.out.println("Minuts is : "+ d.getMinutes());
System.out.println("Seconds is : "+ d.getSeconds());

System.out.println("last seen : "+ d.getHours() +" : "+ d.getMinutes()+ " : "+ d.getSeconds());


System.out.println("-------------------------");

LocalDate date=LocalDate.now();
System.out.println(date);

LocalDate y=date.minusDays(1);
System.out.println(y);

LocalDate t=date.piusDays(1);
System.out.println(t);

System.out.println("------------------------");

LocalDate d1=LocalDate.of(2015, 1,10);
System.out.println("leap year : "+d1.isLeapYear());

LocalDate d2=LocalDate.of(2020, 1,10);
System.out.println("leap year : "+d2.isLeapYear());
}
}