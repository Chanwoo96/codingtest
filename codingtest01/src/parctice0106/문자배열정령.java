package parctice0106;

import java.util.ArrayList;
import java.util.Collections;

public class 문자배열정령 {

	public static void main(String[] args) {
		//
		String[] strings= {"abce", "abcd", "cdx","asdf"};
		int n=1;
		for (int i = 0; i < strings.length-1; i++) {
			for (int j = i+1; j < strings.length; j++) {
				if(strings[i].charAt(n)>strings[j].charAt(n)) {
					String temp= strings[i];
					strings[i]=strings[j];
					strings[j]=temp;
				}
			}
		}
		int count=0;
		ArrayList<String> s = new ArrayList<String>();
		char c = strings[0].charAt(n);
		
		for (int i = 0; i < strings.length; i++) {
			
			if (strings[i].charAt(n)==c) {
			s.add(strings[i]);
			
			}else {
				Collections.sort(s);
				
				for (int j = 0; j < s.size(); j++) {
					strings[j+count]=s.get(j);
				}
				count=i;
				c=strings[i].charAt(n);
				s=new ArrayList<String>();
				s.add(strings[i]);
			}
		}
		
			Collections.sort(s);
			
			for (int j = 0; j < s.size(); j++) {
				strings[j+count]=s.get(j);
			}
	
		
		for (String string : strings) {
			System.out.println(string);
		}
	}
		
}
