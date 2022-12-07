package practice1207;

public class 배열의평균구하기 {
	
		
	 public double getMean(int[] array) {
	    double ret=0;
	    for(int a:array) {
	    	ret+=a;
	    }
	        return ret / array.length;
	    }
	 
	
	public static void main(String[] args) {
		int[] a2= {1,4,8,9};
		배열의평균구하기 get = new 배열의평균구하기();
		System.out.println(get.getMean(a2));
	}

}
