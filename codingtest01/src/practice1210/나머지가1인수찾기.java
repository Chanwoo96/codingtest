package practice1210;

public class 나머지가1인수찾기 {
public static void main(String[] args) {
	// result =3;
	int x=999984;
	int a=1;
	while (true) {
		if(x%++a==1)break;
	}
	System.out.println(a);
	
}
}
