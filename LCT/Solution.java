package LCT;
/*longest contiguous time
 * # First sort the tickets by their start times

# let curr_start & curr_end be the start & end times of the current contiguous queue
curr_start = 0
curr_end = 0 

# let longest be the length of the longest contiguous queue so far
longest = 0

For each ticket (a,b):
	If a > curr_end Then
		longest = max(longest, curr_end - curr_start)
		curr_start = a
		curr_end = b
	Else
		curr_end = max(b, curr_end)
	End
End

return max(longest, curr_end - curr_start)
 */

public class Solution {

}
