package offsetOfRuns;

public class Solution {
	public static void main(String[] args){
		String text = "000010000111";
		offsetOfRuns(text);
	}
	public static void offsetOfRuns(String text) {
	    int requiredOffset = 2;
	    int startIndexOffset = 0;
	    if ( text.length() > 0 ) {
	      int count = 1;
	      char ch = text.charAt(0);
	      for ( int i = 1 ; i < text.length(); ++i ) {
	        if ( text.charAt(i) == ch ) {
	          count++;
	          if (count == requiredOffset) {
	            System.out.println(startIndexOffset);
	          }     
	        } else {
	          startIndexOffset = i;
	          count = 1;
	          ch = text.charAt(i);
	        }
	      }
	    }
	  }
}
