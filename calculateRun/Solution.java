package calculateRun;

public class Solution {
	public static void main(String[] args){
		String s = "abbbbbcc";
		System.out.println(calculateRun(s));
	}
	public static String calculateRun(String s) {
		char runChar = s.charAt(0);
		int maxRun = 1;
		int currentRun = 1;
		int i = 1;
		for (; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i-1)) {
				if (currentRun > maxRun) {
					runChar = s.charAt(i-1);
					maxRun = currentRun;
				}
				currentRun = 1;
			} else {
				currentRun++;
			}
		}
		if (currentRun > maxRun) {
			runChar = s.charAt(i-1);
			maxRun = currentRun;
		}

		StringBuilder res = new StringBuilder();
		for (int j = 0; j < maxRun; j++) {
			res.append(runChar);
		}
		return res.toString();
	}
}
