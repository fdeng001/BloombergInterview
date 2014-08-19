package lexicographic;

public class Solution {
	public static void main(String[] args){
		Test(35,1);
	}
	public static void Test(int N, int k) 
	{ 
		if (k > N) {return;} 

		for(int i = 0; i<10; i++) 
		{ 
			if (k <= N) 
			{ 
				System.out.print(k + " "); 

				k *= 10; 
				Test(N, k); 
				k /= 10; 
				k++; 
				if (k%10 == 0) return; 
			} 
		} 
	} 
}
