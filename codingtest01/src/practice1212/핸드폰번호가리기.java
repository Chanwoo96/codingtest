package practice1212;

public class 핸드폰번호가리기 {
public static void main(String[] args) {
	//내가 푼 코드
	String p="01033334444";
	String[] ps=p.split("");
	p="";
 	for (int i = 0; i < ps.length-4; i++) {
		ps[i]="*";
	}
 	for (int i = 0; i < ps.length; i++) {
		p+=ps[i];
	}
	System.out.println(p);
	
	//toCharArray활용
	 char[] ch = p.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     System.out.println(String.valueOf(ch));
  }
}
