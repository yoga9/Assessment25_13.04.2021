package DateEgProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateProgramEg2 {

public static void main(String[] args) {
		
		System.out.println("LocalDateTime");
		
		LocalDateTime ldt1 = LocalDateTime.of(1999, 01, 15, 11, 30);       	//Way 1
		
		LocalDateTime ldt2 = ldt1.plusDays(15);
		System.out.println("The LocalDateTime for days : "+ldt2);  //1999-01-30T11:30
		
		LocalDateTime ldt3 = ldt1.plusMonths(2);
		System.out.println("The LocalDateTime for months : "+ldt3);  //1999-03-15T11:30
		
		LocalDateTime ldt4 = ldt1.minusYears(5);      //1994-01-15T11:30
		System.out.println("The LocalDateTime for years : "+ldt4);
		
		System.out.println("The LocalDateTime by Using formatter for the above  : " 
		+ldt1.format(DateTimeFormatter.ISO_DATE_TIME)+" "+ ldt2.format(DateTimeFormatter.ISO_DATE_TIME)
		+ " "+ldt3.format(DateTimeFormatter.ISO_DATE_TIME)+" "+ ldt4.format(DateTimeFormatter.ISO_DATE_TIME));
		//1999-01-15T11:30:00 1999-01-30T11:30:00 1999-03-15T11:30:00 1994-01-15T11:30:00
		
	
		LocalDateTime ldt5 = LocalDateTime.of(1999, 01, 15, 11, 30, 20);     //	//Way 2
		
		System.out.println("The LocalDateTime by Using formatter for the above  : " +ldt5.format(DateTimeFormatter.ISO_DATE_TIME)); //1999-01-15T11:30:00
		
		System.out.println("To add some years in the customised Local Date and Time "+ldt5.plusYears(10)+ " " 
		+ldt5.plusMonths(5)+ " "+ldt5.plusDays(10)+ " "+ldt5.plusHours(12)+ " "+ldt5.plusMinutes(30)+ " "+ldt5.plusSeconds(120));
		//2009-01-15T11:30 1999-06-15T11:30:20 1999-01-25T11:30:20 1999-01-15T23:30:20 1999-01-15T12:00:20 1999-01-15T11:32:20
		
		
		
		
	}
}
