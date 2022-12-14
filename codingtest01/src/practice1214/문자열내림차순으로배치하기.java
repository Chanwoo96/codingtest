package practice1214;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		String s="Zbcdefg";
		//내가 푼 코드 시간이 오래걸림
		char[] a=s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i]<a[j]) {
					char t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		String ss="";
		for (char c : a) {
			ss+=c;
		}
		System.out.println(ss);
	//스트링 빌더 훨씬 빠름
		String s1="Zbcdefg";
		char[] b=s1.toCharArray();
		Arrays.sort(b);
	 System.out.println(new StringBuilder(new String(b)).reverse().toString());
	}

}
