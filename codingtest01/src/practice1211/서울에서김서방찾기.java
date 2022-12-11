package practice1211;

//import java.util.Arrays;
public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		// 내가 푼 코드(내가한게 좀더 빠른듯?)
		String[] seoul = { "Jane", "Kim" };
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		System.out.println(answer);
		// 라이브러리 활용한 깔끔한 답안
//		String answer1="";
//		x에 김서방의 위치를 저장하세요.
//		int x = Arrays.asList(seoul).indexOf("Kim");
//	    answer1= "김서방은 "+ x + "에 있다";
//	    System.out.println(answer1);
	}

}
