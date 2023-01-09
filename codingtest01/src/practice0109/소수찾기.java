package practice0109;

public class 소수찾기 {

	public static void main(String[] args) {
	int n=100000;
	int answer=0;
	
		for (int i = 2; i <=n ; i++) {
			boolean s= true;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if(i%j==0) {s=false;break;}
			
		}
		if(s)answer++;
	}
		System.out.println(answer);
	}

}
