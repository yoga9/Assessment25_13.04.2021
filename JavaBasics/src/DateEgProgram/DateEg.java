package DateEgProgram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateEg {

	public static void main(String[] args) {
	
		System.out.println("LocalDate");
		
		LocalDate ld1 = LocalDate.now();
		System.out.println("The LocalDate : "+ld1);
		
		int day = ld1.getDayOfMonth();
		System.out.println("Day : " +day);
		
		int month = ld1.getMonthValue();
		System.out.println("Month : "+month);
		
		int year = ld1.getYear();
		System.out.println("Year : "+year);
		
		int dayOfYear = ld1.getDayOfYear();
		System.out.println("Year : "+dayOfYear);
		
		System.out.println("To Print customised Date from the above : " +day+ "/" +month+ "/"+year);
		System.out.println("To Print customised Date from the above : " +year+ "-" +month+ "-"+day);
		System.out.printf("To Print customised Date from the above by Using Symbols : " +"%d-%d-%d" , day,month,year);
		
		System.out.println();
		
		System.out.println("LocalTime");
		
		LocalTime lt1 = LocalTime.now();
		System.out.println("The LocalTime : "+lt1);
		
		int hours = lt1.getHour();
		System.out.println("Hours : "+hours);
		
		int minute = lt1.getMinute();
		System.out.println("Minute : "+minute);
		
		int second = lt1.getSecond();
		System.out.println("Second : "+second);
		
		int nanoSecs = lt1.getNano();
		System.out.println("NanoSecond : "+nanoSecs);
		
		System.out.println("To Print customised Time from the above : " +hours+ ":" +minute+ ":" +second);
		System.out.printf("To Print customised Time from the above by using Symbols : " +"%d:%d:%d:%d" , hours,minute,second,nanoSecs);
		
		System.out.println();
		
		System.out.println("LocalDateTime");
		
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println("The Local Date and Time : "+ldt1);
		
		LocalDateTime ldt2 = LocalDateTime.of(1999, 01, 15, 11, 30);
		System.out.println("The customised Local Date and Time : " +ldt2);
		System.out.println("To add some years in the customised Local Date and Time "+ldt2.plusYears(5)+ " " +ldt2.plusMinutes(30));
		System.out.println("To minus some months in the customised Local Date and Time "+ldt2.minusMonths(5));
		
		System.out.println();
		
		System.out.println("Zone Id");
		
		ZoneId zone1 = ZoneId.of("Asia/Singapore");
		System.out.println("The Zone Id : "+zone1);
		
		ZonedDateTime zdt1 = ZonedDateTime.now();     // 2021-04-14T10:37:37.474+05:30[Asia/Calcutta]
		System.out.println("The Zoned DateTime : "+zdt1);
		
//		
//		for(String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println("The AvailableZoneIds are : " +s);
//		}

		
		System.out.println();
		
		System.out.println("LocalDate & LocalDateTime By Using Formatter");
		
		//String s1 = LocalDate.parse("2021-06-15").format("yyyy-MM-dd"); --- its not working
		LocalDate ld2 = LocalDate.parse("2020-03-18" , DateTimeFormatter.ISO_DATE);    //2020-03-18
		System.out.println("The LocalDate by using formatter "+ld2);
		
		LocalDateTime ldt3 = LocalDateTime.of(1999, 12, 06, 07, 40);
		LocalDateTime ldt4 = ldt3.plusMonths(5);
		System.out.println("The LocalDateTime : "+ldt3);
		System.out.println("The LocalDateTime by Using formatter : "+ ldt4.format(DateTimeFormatter.ISO_DATE_TIME));
		
//Sample 1
		LocalDate ld10 = LocalDate.of(1999, 12, 03);
		LocalDate m = ld10.plusYears(10);
		System.out.println(ld10.plusYears(10));     //2009-12-03
		System.out.println(m);
		
		
		LocalDate n = ld10.minusDays(-1);
		System.out.println(n);     //1999-12-04

		LocalDate b = ld10.plusDays(32);    //2000-01-04
		System.out.println(b);
		
//		LocalDate v = LocalDate.of(1991, 12, 32); //Invalid value for DayOfMonth (valid values 1 - 28/31): 32 - JavaDateTimrException.
//		System.out.println(v);
//		System.out.println(v.plusDays(22));
		
		String date1 = LocalDate.parse("2021-09-16").format(DateTimeFormatter.ISO_DATE);  //2021-09-16
		System.out.println(date1);
		
	
		
		
		

	}

}
