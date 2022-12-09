package practice1209;


public class 공차x인등차수열n개 {

	public static void main(String[] args) {
		//내가 푼 코드
		int x=-1000000;
		int n=1000;
		long x2=x;
		long[]a =new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=x2*(i+1);
			
		}
		for (long l : a) {
			System.out.println(l);
		}
	   //조금더 향상된 코드
		  long[] answer = new long[n];
	        answer[0] = x;

	        for (int i = 1; i < n; i++) {
	            answer[i] = answer[i - 1] + x;
	        }
	        for (long l : answer) {
				System.out.println(l);
			}
	}

}
