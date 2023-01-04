package practice0104;

import java.util.ArrayList;

public class 자연수3진법뒤집기 {

	public static void main(String[] args) {
		int n =45;
		ArrayList<Integer> a = new ArrayList<Integer>();
		int answer=0;
	//3진법의 뒤집은 배열만들기형태 만들기
	while (n>2) {
		a.add(n%3);
		n/=3;
	} ;
		a.add(n);//마지막 나머지 넣어주기
		System.out.println(a.toString());
		int count=0;
		//3진법 수 수로 바꿔주기
		for (int i = a.size()-1; i >=0 ; i--) {
			int b=a.get(i);
			for (int j = 0; j < count; j++) {
				b*=3;
			}
			answer+=b;
			count++;
		}
		System.out.println(answer);
//		for (int i = three.length(); i < ; i++) {
//			String string = three[i];
//			
//		}
		
		
		
//		1 0	1
//	2 0 2
//	3 1 0
//	4 1 1
//	5 1	2
//	6 2	0
//	7 2 1
//	8 2 2
//	9 3 0
//	  1 0 0
//	10 3 1
//	   1 0 1
//	11 3 2
//	   1 0 2
//	12 4 0
//	   1 1  0
	}

}
