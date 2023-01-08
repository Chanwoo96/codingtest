package practice0108;

import java.util.TreeSet;

public class 두수합의경우의수 {

	public static void main(String[] args) {
		int[] answer;
		int[] numbers= {2,1,3,4,1};
		//더한 값 중 중복을 걸러내고 정렬하여 저장할 treeset사용
		TreeSet<Integer> n = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				n.add(numbers[i]+numbers[j]);
				System.out.println(numbers[i]+numbers[j]);
			}
		}
		
		answer=new int[n.size()];
		//treeset의 각 값들을 순서대로 int array로 옮기기
		int count=0;
		for (Integer integer : n) {
			answer[count]=integer;
			count++;
			System.out.println(integer);
		}
		
		
	}

}
