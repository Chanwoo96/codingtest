package practice0108;


public class 문자열치환 {

	public static void main(String[] args) {
		String s ="one4seveneight";
		//replaceall에서 변환해야할 문자 목록 index순서대로 저장
		String[] ss= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for (int i = 0; i < ss.length; i++) {
			s=s.replaceAll(ss[i], i+"");
		}
		int answer= Integer.parseInt(s);
		System.out.println(answer);
	}

}
