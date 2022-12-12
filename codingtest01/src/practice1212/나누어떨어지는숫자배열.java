package practice1212;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		// 내가 푼 코드
		int[] arr = { 2, 54, 34, 21 };
		int div = 1;
		int[] array = { -1 };
		ArrayList<Integer> a = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % div == 0) {
				count++;
				a.add(arr[i]);
			}
		}
		if (count > 0) {
			array = new int[count];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) a.toArray()[i];
			}
			Arrays.sort(array);
		}
		System.out.println(Arrays.toString(array));
		// 살짝 느리지만 간단한 코드
		  int[] answer = Arrays.stream(arr).filter(factor -> factor % div == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          System.out.println(Arrays.toString(answer));
	}
}
