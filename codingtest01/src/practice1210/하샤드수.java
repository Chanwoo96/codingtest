package practice1210;

public class 하샤드수 {

	public static void main(String[] args) {
		int x = 18;
		int xx=x;
		int sum=0;
		while(xx>0) {
			sum+=xx%10;
			xx/=10;
		}
		System.out.println(x%sum==0);
	}

}
