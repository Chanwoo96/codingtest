package practice1213;

public class 배열내음양더하기 {
	public static void main(String[] args) {
		//배열의 절댓값에 음양 곱하고 합찾기
	int[] n= {4,7,12};
	boolean[] b= {true,false,true};
	int sum=0;
	for (int i = 0; i < b.length; i++) {
		if(!b[i]) n[i]*=-1;
		sum+=n[i];
	}
	System.out.println(sum);
	System.out.println(n[0]);
	}
}
