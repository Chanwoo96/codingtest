package practice1213;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		//배열에 없는 숫자 더하기
		int[]	n= {1,2,3,4,6,7,8,0};
		int answer=45;
		for (int i = 0; i < n.length; i++) {
			answer-=n[i];
		}
		System.out.println(answer);
	}

}
