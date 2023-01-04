package practice0104;

import java.util.Arrays;

public class 예산배분 {

	public static void main(String[] args) {
		int[] d= {2,2,3,3};
		int budget=10;
		//작은 순서로 정렬
		Arrays.sort(d);
		int answer=0; //지원할 부서 갯수
		//신청 예산이 작은 부서별로 예산주고 모자라면 배분 정지 
		for (int i : d) {
			budget-=i;
			if(budget>=0) {
				answer++;
			}else {
				break;
			}
		}
		System.out.println(answer);
	}

}
