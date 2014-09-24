package Abs3min;

import java.util.Arrays;

public class Solkution {

	public static void main(String[] args){
		int[] a={1,3,4,5};
		int[] b={2,10,4,7};
		int[] c={9,11,25,4};
		System.out.println(getMin(a,b,c));
		
	}
	public static int getMin(int[] a, int[] b, int[] c){
		int la = a.length;
		int lb = b.length;
		int lc = c.length;
		int ia,ib,ic;
		ia=ib=ic=0;
		int min = Integer.MAX_VALUE;
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		while(true){
			if(ia == la-1 && ib == lb-1 && ic ==lc-1){
				break;
			}
			int res = Math.abs(a[ia]-b[ib])+Math.abs(b[ib]-c[ic])+Math.abs(c[ic]-a[ia]);
			min = Math.min(res, min);
			
			if(ia<la-1 &&(ib==lb-1 || a[ia]<b[ib])&&(ic==lc-1 || a[ia]<c[ic]))
				ia++;
			else if(ib<lb-1 &&(ic==lc-1 || b[ib]<c[ic]))
				ib++;
			else
				ic++;
			
		}
		return min;
		
	}
}
