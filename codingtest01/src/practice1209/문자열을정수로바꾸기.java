package practice1209;

public class 문자열을정수로바꾸기 {

	public static void main(String[] args) {
		//내가 푼 오래걸리는 방법(런타임 오류)
		String s = "-23423";
		int n=0;
		if(s.charAt(0)=='-') {
		for (int i = 1; i < s.length(); i++) {
			n*=10;
			n+=(s.charAt(i)-48);
		}
		n*=-1;
		}else {
			for (int i = 0; i < s.length(); i++) {
				n*=10;
				n+=(s.charAt(i)-48);
			}
		}
		
		System.out.println(n);
		//함수이용 쉬운방법
		System.out.println(Integer.parseInt(s));
	}

}
