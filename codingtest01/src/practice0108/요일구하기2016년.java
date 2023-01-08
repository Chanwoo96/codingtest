package practice0108;

import java.time.LocalDate;

public class 요일구하기2016년 {

	public static void main(String[] args) {
		int a=5;
		int b=24;
		String answer="";
		LocalDate date = LocalDate.of(2016,a,b);
		String[] Day= {"","MON","TUE","WED","THU","FRI","SAT","SUN"};
		answer=Day[date.getDayOfWeek().getValue()];
		System.out.println(answer);
	}

}
