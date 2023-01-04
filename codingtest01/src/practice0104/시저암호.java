package practice0104;

public class 시저암호 {

	public static void main(String[] args) {
//		String
		//A=65 Z=90  a=97 z=122
//		char a= 'a';
//		int b=1;
//		char c=(char)(a+1);
//		System.out.println(a+b-b);	
//		System.out.println(c);
		
		String s= "a B z";
		int n=4;
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			//공백은 넘기기
			if(c[i]==' ')continue;
			//대문자끼리 시저 암호만들기
			if (c[i]<=90) {
				if(c[i]+n>90) c[i]=(char)(c[i]-26);
				c[i]=(char)(c[i]+n);
			}else {//소문자끼리 시저 암호만들기
				if(c[i]+n>122) c[i]=(char)(c[i]-26);
				c[i]=(char)(c[i]+n);
			}
		}
		//변환 결과 찍어보기
		for (char d : c) {
			System.out.println(d);
		}
		String answer=String.valueOf(c);
		System.out.println(answer);
		
	}
}
