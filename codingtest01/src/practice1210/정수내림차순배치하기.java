package practice1210;

//import java.util.Arrays;

public class 정수내림차순배치하기 {
	public static void main(String[] args) {
		long x= 723486237;
		// 내가 푼 방법 Long.parseLong참고
		char[] s= String.valueOf(x).toCharArray();
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i]<s[j]) {
					char temp= s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		x =Long.parseLong(String.copyValueOf(s));
		System.out.println(x);
		//정렬 방법 참고 후 코드 Arrays사용 효율은 안나옴
//		char[]s= String.valueOf(x).toCharArray();
//		Arrays.sort(s);
//		StringBuilder ss = new StringBuilder(new String(s));
//		x=Long.parseLong(ss.reverse().toString()) ;
//		System.out.println(x);
	}

}
