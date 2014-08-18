package Common5Array;
import java.util.*;

public class Solution {
	public static void main(String[] args)
	{
		int[] arr1 = {20, 15, 3, 10, 14, 35, 21, 14};
		int[] arr2 = {3, 10, 14, 18, 36, 15, 17, 25, 41};
		int[] arr3 = {12, 10, 37, 10, 15, 3};
		int[] arr4 = {22, 14, 25, 10, 15, 28, 3};
		int[] arr5 = {14, 10, 3, 10, 15, 18, 35};


		Hashtable<Integer, Boolean> table1 = new Hashtable<Integer, Boolean>();
		Hashtable<Integer, Boolean> table2 = new Hashtable<Integer, Boolean>();

		for (int i=0; i<arr1.length; i++)
		{
			table1.put(arr1[i],true);
		}

		for(int i=0; i<arr2.length; i++)
		{
			if (table1.containsKey(arr2[i]))
				table2.put(arr2[i],true);
		}
		table1= new Hashtable<Integer, Boolean>(table2);
		table2= new Hashtable<Integer, Boolean>();
		for(int i=0; i<arr3.length; i++)
		{
			if (table1.containsKey(arr3[i]))
				table2.put(arr3[i],true);
		}
		table1= new Hashtable<Integer, Boolean>(table2);
		table2= new Hashtable<Integer, Boolean>();
		for(int i=0; i<arr4.length; i++)
		{
			if (table1.containsKey(arr4[i]))
				table2.put(arr4[i],true);
		}
		table1= new Hashtable<Integer, Boolean>(table2);
		table2= new Hashtable<Integer, Boolean>();
		for(int i=0; i<arr5.length; i++)
		{
			if (table1.containsKey(arr5[i]))
				table2.put(arr5[i],true);
		}
		System.out.print(table1);
		System.out.println();
		for(Object o : table1.keySet()) {
			Integer lln = (Integer)o;
		    System.out.println(lln);
		}

	}

}
