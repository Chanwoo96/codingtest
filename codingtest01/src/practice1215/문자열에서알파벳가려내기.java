package practice1215;

public class 문자열에서알파벳가려내기 {

	public static void main(String[] args) {
		String s="1234567890a";
		//48~57까지
//		char a='9';
//		System.out.println(a+0);
		// s.charAt(i)를 쓰는 편이 좀더 깔끔했을거 같다.
		char[]aa=s.toCharArray();
		boolean answer=true;
		
		for (int i = 0; i < aa.length; i++) {
			if (s.length()!=4&&s.length()!=6) {
				answer=false;
				break;
			}
			//문자열의 아스키 코드값 범위로 0~9판단
			if(aa[i]+0>=48 && aa[i]+0<=57) {
				
			}else {
				answer=false;
			}
		}
		System.out.println(answer);
		
	}

}
