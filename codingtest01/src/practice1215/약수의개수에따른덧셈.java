package practice1215;

public class 약수의개수에따른덧셈 {
	public static void main(String[] args) {

		int left = 13;
		int right = 17;
		int answer = 0;
		int count = 0;
		//주어진 범위에 해당하는 수 반복하기
		for (int i = left; i <= right; i++) {
			//약수의 수체크를 위한 반복 
			for (int j = 1; j <=i ; j++) {
				//약수의 갯수 세기
				if(i%j==0)count++;
			}
			//약수의 갯수에 따른 더하기 빼기
			if(count%2==0) {answer+=i;
			System.out.println(i);
			}else {
				System.out.println(-i);
				answer-=i;
				}
			count=0;
		}
		System.out.println(answer);
	}
}
