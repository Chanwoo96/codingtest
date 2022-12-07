package practice1207;

import java.util.Scanner;

public class 약수의합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long start =System.currentTimeMillis();
		int result=n;
		int t=n/2;
		while(t>0) {
			if(n%t==0) {
				result+=t;
			}
			t--;
		}
		long end =System.currentTimeMillis();
		System.out.println(result);
		System.out.println(end-start);
		sc.close();
		
	}

}
