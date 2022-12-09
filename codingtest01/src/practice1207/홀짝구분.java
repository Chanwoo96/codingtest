package practice1207;

import java.util.Scanner;

public class 홀짝구분 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String result="Odd";
			if(sc.nextInt()%2==0) {
				result="Even";
			}
			System.out.println(result);
		}
	}

}
