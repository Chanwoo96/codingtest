package practice0110;

import java.util.ArrayList;

public class 모의고사 {

	public static void main(String[] args) {
		int[] s1= {1,2,3,4,5};
		int[] s2= {2, 1, 2, 3, 2, 4, 2, 5};
		int[] s3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] answers= {2, 1, 2, 3, 2, 4, 2, 5};
		int[] answer= {};
		//점수 배열
		int[] score =new int[3];
		
		for (int i = 0; i < answers.length; i++) {
			//1번학생 점수
			if(answers[i]==s1[i%s1.length]) {
				score[0]++;
			}
			//2번 학생 점수
			if(answers[i]==s2[i%s2.length]) {
				score[1]++;
			}
			//3번 학생 점수
			if(answers[i]==s3[i%s3.length]) {
				score[2]++;
			}
		}
		int max=0;
		for (int i = 0; i < score.length; i++) {
			if(score[i]>max) {
				max=score[i];
			}
		}
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < score.length; i++) {
			if(score[i]==max) {
				a.add(i+1);
			}
		}
		answer= new int[a.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=a.get(i);
			
		}
		for (Integer integer : answer) {
			
			System.out.println(integer);
		}
	}


}
