package practice0111;

public class 콜라병바꿔먹기 {

	public static void main(String[] args) {
		int a =3;//새콜라를 받기 위해 필요한 빈병수
		int b =1;//빈병을 주면 받는 새 콜라 수
		int n =20;//빈병의 갯수
		int answer=0; //빈병으로 먹을수 있는 콜라의 총 수
		while(n>=a) {
			answer+=n/a*b;
			n=n/a*b+n%a;
		}
		System.out.println(answer);
		System.out.println((n-b)/(a-b)*b);
	}

}
