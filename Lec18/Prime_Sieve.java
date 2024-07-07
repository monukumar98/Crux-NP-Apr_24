package Lec18;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.println(sieve_of_Eratosthenes(n));
	}

// 0--> index prime number hoga
// 1--> index not prime number 	
	public static int sieve_of_Eratosthenes(int n) {
		int[] prime = new int[n + 1];
		prime[0] = 1;// not prime number
		prime[1] = 1;// not prime number
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == 0) {
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = 1;
				}
			}

		}
		int c = 0;
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == 0) {
				c++;
			}
		}
		return c;

	}

}
