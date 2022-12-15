package practice1215;

public class 부족한금액계산 {

	public static void main(String[] args) {
		//내가 푼코드 
		//가격
		int price=2;
		int money=1000;
		int count=2;
		long sumprice=0;
		for (int i = 1; i <= count; i++) {
			sumprice+=price*i;
		}
		//부족한 비용
		
		long answer=sumprice-money;
		if (answer<0)answer=0;
		System.out.println(answer);
	}

}
