package practice1208;

public class 자연수뒤접어배열로만들기 {

	public static void main(String[] args) {
		
		int n=123456;
		String num= String.valueOf(n);
		//내가 푼코드
		int[] answer= {};
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		
		}
		// 부분적으로 효율성 올리는 코드
//		int[] answer1= new int[num.length()];
		answer=new int[count];
		for (int i = 0; i < answer.length; i++) {
			int x= Integer.parseInt(num.substring(answer.length-1-i,answer.length-i));
			answer[i]=x;
		}
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
