package Factorial;

public class factorial {
	public static void main(String[] args) {
		int n = 5, m;
		System.out.println("Finding the factorial of "+ n);
		m= fact(n);
		System.out.println(m);
	}

	
	public static int fact (int x) {
		 int i, k;
		 
		 if(x==1) {
			 i=1;
			 k= x*i;
		 }else {
		 i = fact(x-1); 		 
		 k = x*i; 	 			
		}
		return k;
	}
}
	
