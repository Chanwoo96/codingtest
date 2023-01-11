package practice0111;

import java.util.ArrayList;

public class 배열의소수조합수 {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int answer=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int n = j+1; n < nums.length; n++) {
					list.add(nums[i]+nums[j]+nums[n]);
				}
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
			boolean sosu=true;
			for (int i = 2; i <=Math.sqrt(integer); i++) {
				if(integer%i==0) {
					sosu=false;
					break;
				}
			}
			if(sosu) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
