package practice1208;

public class 자릿수더하기 {

	public static void main(String[] args) {
		//내가 푼 답
		int n = 123456;
		int n2 =n;
		int sum=0;
		int sum2=0;
		int mok=0;
		int mod=0;
		mok=n2/10;
		while(mok>0) {
			mok=n2/10;
			mod =n2%10;
			sum+=mod;
			n2=mok;
		}
		//나보다 잘푼 효율적인 코드
		while(n>0) {
			sum2+=n%10;
			n/=10;
		}
		
		System.out.println(sum+" "+ sum2);
	}

}
