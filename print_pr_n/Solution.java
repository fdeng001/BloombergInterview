package print_pr_n;
import java.util.*;
public class Solution {
	public static void main(String[] args){
		//print_pr_n(100);
		printPrimes(100);
	}
	public static void print_pr_n(int n){
		HashSet<Integer> maps = new HashSet<Integer>();
		if(n>=1)
			System.out.print("1, ");
		for(int i = 2;i<=n;i++){
			if(maps.contains(i))
				continue;
			System.out.print(i+", ");
			if(i<=Math.sqrt(n)+1){
				for(int j = 2;i*j<=n;j++){
					maps.add(i*j);
				}
			}
		}
	}
	public static void printPrimes(int num)
	{

			HashSet<Integer>primes = new HashSet<Integer>(num);
			//Add the numbers that will help us with the conditions.
	        primes.add(1);
			primes.add(2);
			primes.add(3);
			primes.add(5);
			primes.add(7);
			
			if(num > 4){
				
				for (int i = 2; i < num; i++)
				{		
					if ((i % 2) ==0 || (i % 3) == 0 || (i % 5) == 0 || (i % 7) == 0)
						continue;
					else
	 					primes.add(i);
				}
				
				for (int i = 1; i < num; i++)
				{	
					if (primes.contains(i) && i<=num)
						System.out.print("\n" + i);
			
				}
		}
	}
}
