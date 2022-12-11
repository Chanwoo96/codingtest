package practice1211;

public class 콜라츠추측 {

	public static void main(String[] args) {
		//계산 과정에서 데이터값이 오버플로우 나는 경우를 항상 조심하자
		int numo=626331;
		int answer=0;
		long num= numo;
		 while(num!=1){
			 
	            if(num%2==0) {num/=2;}
	            else {
	            	num=num*3+1;
	            }
	            System.out.println(num);
	            answer++;
	            if(num==1)break;
	            if (answer==501) {answer=-1;break;}
	        }
		 System.out.println(answer);
	}

}
