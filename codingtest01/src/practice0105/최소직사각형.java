package practice0105;

import java.util.Arrays;

public class 최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes={{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int a=0;
		int b=0;
		for (int i = 0; i < sizes.length; i++) {
			//짧은 길이를 a 긴길이를 b로 묶어주기
			Arrays.sort(sizes[i]);
			if(sizes[i][0]>a)a=sizes[i][0];
			if(sizes[i][1]>b)b=sizes[i][1];
			
		}
		int answer=a*b;
		System.out.println(answer);
	}

}
