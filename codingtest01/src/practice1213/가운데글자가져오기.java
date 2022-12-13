package practice1213;

public class 가운데글자가져오기 {
public static void main(String[] args) {
	//내가 푼 멍청한 코드 나누기결과값을 잘 생각해보자
	String s= "asa";
	String answer="";
	if(s.length()<3) {
		answer=s;
	}else {
	if(s.length()%2==0) {
		answer=s.substring(s.length()/2-1, s.length()/2+1);
	}else{
		answer=s.substring(s.length()/2, s.length()/2+1);
	}
	}

	//깔끔하고 논리적인 코드
	String answer2="";
		answer2=s.substring((s.length()-1)/2, s.length()/2+1);
	
	
	System.out.println(answer);
	System.out.println(answer2);
}
}
