package practice1214;

public class 반복되는글자적기 {

	public static void main(String[] args) {
		//내가 푼 코드
		String s="";
		int x=7;
		for (int i = 0; i < x; i++) {
			if(i%2==0) {
			s=s.concat("수");	
			}else {
				s=s.concat("박");
			}
		}
		System.out.println(s);
	}

}
