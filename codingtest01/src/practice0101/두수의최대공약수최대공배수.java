package practice0101;

public class 두수의최대공약수최대공배수 {

	public static void main(String[] args) {
		int a=3;
		int b=12;
		int[] answer= {0,0};
		if (a>b) {
			for (int i = b; i >0 ; i--) {
				if (a%i==0&b%i==0) {
					answer[0]=i;
					break;
				}
			}
			answer[1]=answer[0]*(a/answer[0])*(b/answer[0]);
		
			
		}else {
			for (int i = a; i >0 ; i--) {
				if (a%i==0&b%i==0) {
					answer[0]=i;
					break;
				}
			}
			answer[1]=answer[0]*(a/answer[0])*(b/answer[0]);
		}
		for (int i : answer) {
			System.out.print(i);
		}
	}

}
