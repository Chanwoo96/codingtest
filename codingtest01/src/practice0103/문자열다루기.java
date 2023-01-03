package practice0103;

public class 문자열다루기 {

	public static void main(String[] args) {
		//정답 판정 못받음
		String s= "  3tRy hello  WORLD     " ;
		String answer="";
		//String 띄어쓰기별로 분리
//		String[] ss= s.split(" ");
//		//정답제출용 String
//		//split한 string별로 처리하기
//		for (String string : ss) {
//			System.out.println(string);
//			if(string.equals(""))continue;
//			for (int i = 0; i < string.length(); i++) {
//				//각 string의 짝수번째 글자를 대문자로 바꾸어 answer에 넣기
//				if(i%2==0) {
//				answer+= string.substring(i, i+1).toUpperCase(); 
//				}else {
//					//각 string의 홀수번째 글자를 소문자로 바꾸어 answer에 넣기
//				answer+= string.substring(i, i+1).toLowerCase(); 
//					
//				}
//			}
//			//한단어가 끝날 때마다 공백 넣어주기
//			answer+=" ";		
//		}
//		//마지막에 한번 더들어간 공백 제거
//		answer=answer.substring(0, answer.length()-1);
//		System.out.println(answer);
		//2번째 도전
//		System.out.println(s.substring(0, 1).equals(" "));
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.substring(i, i+1).equals(" ")& count==0) {
				answer+=" ";
				continue;
			}
			if(s.substring(i, i+1).equals(" ")& count!=0) {
				count=0;
				answer+=" ";
				continue;
			}
			if(count%2==0) {
				answer+=s.substring(i,i+1).toUpperCase();
				count++;
				continue;
			}
			if(count%2==1) {
				answer+=s.substring(i,i+1).toLowerCase();
				count++;
				continue;
			}
		}
		if(answer.length()>s.length())answer=answer.substring(0, s.length());
		System.out.println(answer);
	}
}


