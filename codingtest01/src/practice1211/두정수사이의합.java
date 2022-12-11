package practice1211;

public class 두정수사이의합 {
	public static void main(String[] args) {
		// 자나 깨나 데이터 타입 생각 계산상 데이터 타입 확인
	int i=1000000001;
	int j=2000000000;
	int count=0;
	if (i>j) {
	count=i-j+1;
	}else {
		count=j-i+1;
	}
	
	long sum=((long)i+(long)j)*count/2;

	System.out.println(sum);
	
	}
	
//	1500000001500000000

}
