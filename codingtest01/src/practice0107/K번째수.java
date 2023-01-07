package practice0107;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {

	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer= new int[commands.length];
		
		for (int i = 0; i < answer.length; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
				a.add(array[j]);
			}
			Collections.sort(a);
			answer[i]=a.get(commands[i][2]-1);
		}
		for (int i : answer) {
			System.out.println(i);
		}
	}

}
