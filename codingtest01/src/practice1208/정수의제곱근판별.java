package practice1208;

public class 정수의제곱근판별 {

	public static void main(String[] args) {
		long n = 10000;
		long answer = -1;
		long i = 0;
		while (n >= i * i) {
			if (i * i == n) {
				answer = (++i) * (i);
				break;
			}
			i++;
		}

		System.out.println(answer);
	}

}
