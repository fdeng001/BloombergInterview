package quickSelect;

public class Solution {
	public static void main(String[] args) {
        int[] list = { 3, 5, 9, 10, 7, 40, 23, 45, 21, 2 };
        int k = 6;
        Integer kthSmallest = selectKth(list, k-1);

        if (kthSmallest != null) {
            System.out.println("The kth smallest element in the list where k=" + k + " is " + kthSmallest + ".");
        } else {
            System.out.println("There is no kth smallest element in the list where k=" + k + ".");
        }
    }
	
	public static int selectKth(int[] arr, int k) {
		if (arr == null || arr.length <= k)
			throw new Error();

		int from = 0, to = arr.length - 1;

		// if from == to we reached the kth element
		while (from < to) {
			int r = from, w = to;
			int mid = arr[(r + w) / 2];

			// stop if the reader and writer meets
			while (r < w) {

				if (arr[r] >= mid) { // put the large values at the end
					int tmp = arr[w];
					arr[w] = arr[r];
					arr[r] = tmp;
					w--;
				} else { // the value is smaller than the pivot, skip
					r++;
				}
			}

			// if we stepped up (r++) we need to step one down
			if (arr[r] > mid)
				r--;

			// the r pointer is on the end of the first k elements
			if (k <= r) {
				to = r;
			} else {
				from = r + 1;
			}
		}

		return arr[k];
	}
}
