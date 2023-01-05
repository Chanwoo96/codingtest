package practice0105;

public class 비밀지도 {

	public static void main(String[] args) {
		int n=5;
		int[] arr1= {9,20,28,18,11};
		int[] arr2= {30, 1, 21, 17, 28};
		String[] answer=new String[n];
		String s="";
		
		//arr1의 2진법 배열
		String[] ss=new String[n];
		for (int i = 0; i < n; i++) {
			
			s="";
		while(arr1[i]>0) {
			
			s=arr1[i]%2+s;
			arr1[i]=arr1[i]/2;
		}
		int len=s.length();
		
		for (int j = 0;j <n-len; j++) {
			s=0+s;
		
		}	
		ss[i]=s;
		}
		//arr2의 2진법 배열
		String[] ss2=new String[n];
		for (int i = 0; i < n; i++) {
			
			s="";
			while(arr2[i]>0) {
				
				s=arr2[i]%2+s;
				arr2[i]=arr2[i]/2;
			}
			int len=s.length();
			for (int j = 0;j <n-len; j++) {
				s=0+s;
				
			}	
			ss2[i]=s;
		}
		//두 배열에서 모두 0인 부분만 공백처리
		for (int i = 0; i < n; i++) {
			String ans = "";
			for (int j = 0; j < n; j++) {
				if (ss[i].substring(j, j + 1).equals("0") & ss2[i].substring(j, j + 1).equals("0")) {
					ans += " ";
					
				}else {
					ans+="#";
				}
			}
			answer[i]=ans;
		}
	}

}
