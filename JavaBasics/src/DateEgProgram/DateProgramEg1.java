package DateEgProgram;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateProgramEg1 {
	
	public static void main(String[] args) {
		
		System.out.println("LocalDate");
		
		LocalDate ld1 = LocalDate.now();
		System.out.println("The LocalDate : "+ld1);
		
		LocalDate ld2 = LocalDate.of(2021, 04, 14);
		//LocalDate m = ld2.plusYears(10);
		System.out.println("The LocalDate added with some Years : " +ld2.plusYears(10));    //2031-04-14
		//System.out.println(m);
		
		LocalDate ld3 = LocalDate.parse("2020-03-18" , DateTimeFormatter.ISO_DATE);    //2020-03-18
		System.out.println("The LocalDate by using formatter "+ld3);
		
		LocalDate ld4 = LocalDate.parse("2020-03-18");
		System.out.println(ld4);  //2020-03-18
		
	
		
	}
}
