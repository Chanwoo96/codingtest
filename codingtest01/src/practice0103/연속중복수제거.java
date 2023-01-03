package practice0103;

import java.util.ArrayList;
import java.util.Arrays;

public class 연속중복수제거 {

	public static void main(String[] args) {
		int[] a= {1,1,3,3,0,1,1};
		//배열의 값을 리스트로 옮기기
		ArrayList<Integer>  b= new ArrayList<Integer>();
		//연속 중복 검증을 위한 초기값
		b.add(a[0]);
		System.out.println(b.get(0));
		int count=0;
		for (int i = 1; i < a.length; i++) {
			//중복여부 체크
			if(b.get(count)!=a[i]) {
				
				b.add(a[i]);
				count++;
				System.out.println(a[i]);
			}
		}
		//
		int[] answer=new int[b.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=b.get(i);
			
		}
		System.out.println(Arrays.toString(answer));
	}

}
