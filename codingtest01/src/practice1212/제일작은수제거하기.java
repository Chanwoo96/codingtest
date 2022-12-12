package practice1212;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {
	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 1 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[x] > a[i]) {
				x = i;
			}
			arr.add(a[i]);
		}
		arr.remove(x);
		int[] answer= new int[1]; 
		   if(arr.size()==0){
	            answer[0]=-1;
	        }else{
	        answer=	new int[arr.size()]; 
		for (int i = 0; i < arr.size(); i++) {
			answer[i]=(int)arr.toArray()[i];
		}
	        }
		System.out.println(Arrays.toString(answer));
		
	

	}
}