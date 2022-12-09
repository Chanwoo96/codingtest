package practice1209;

public class 문자열내문자갯수비교 {
	public static void main(String[] args) {
		// 나의 풀이
//		int p=0;
//		int y=0;
//		String answer="false";
//		String s="Pyy";
//		String ss=s.toLowerCase();
//		for (int i = 0; i < ss.length(); i++) {
//		if (ss.substring(i, i+1).equals("p")) {
//			p++;
//		}else if (ss.substring(i, i+1).equals("y")) {
//			y++;
//		} 
//		}
//		if(y==p) answer="true";
//		
//		System.out.println(answer);
		//개선
		int count=0;
		String s="pasdhufawofysafkzxjcgyufdkfasjgfweyuGSDYKCYUpppp";
		String ss=s.toLowerCase();
		for (int i = 0; i < ss.length(); i++) {
		if (ss.charAt(i)=='p') {
			count++;
		}else if (ss.charAt(i)=='y') {
			count--;
		} 
		}
		System.out.println(count==0);
	}
}
