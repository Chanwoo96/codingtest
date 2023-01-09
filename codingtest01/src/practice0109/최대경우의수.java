package practice0109;

import java.util.HashSet;

public class 최대경우의수 {

	public static void main(String[] args) {
		int[] nums= {3,3,3,2,2,2};
		int answer=0;
		//선택할 수 있는 갯수
		int select=nums.length/2;
		//중복제거
		HashSet<Integer> dif = new HashSet<Integer>();
		for (Integer integer : nums) {
			dif.add(integer);
		}
		if(select>dif.size()) {
			answer=dif.size();
		}else {
			answer=select;
		}
		System.out.println(answer);
	}

}
