package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int n =103;
		int prime = 0;
for (int i = 2; i < n; i++) {
	
	int j = n%i;
	if(j==0) {
		
		prime =1;
	}
}

if(prime==1) {
	
	System.out.println(n + " is not prime number");
}else {
	
	System.out.println(n + " is prime number");
}
		
	}

}
