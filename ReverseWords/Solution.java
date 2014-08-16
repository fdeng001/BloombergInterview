package ReverseWords;

public class Solution {
	
	public static void main(String[] args){
		String s = "I Love You";
		System.out.println(reverseWords(s));
		char[] c = s.toCharArray();
		System.out.println(reverseWords2(c));
	}
	public static String reverseWords(String s){
		if(s.length()<1|| s== null){
			return "";
		}
		String[] str = s.split(" ");
		StringBuilder res = new StringBuilder();
		for(int i = str.length-1;i>=0;i--){
			if(!str[i].equals(""))
				res.append(str[i]).append(" ");
		}
		return res.length() == 0? "":res.substring(0, res.length()-1);	
	}
	public static String reverseWords2(char[] c){
		if(c.length<1|| c== null){
			return "";
		}
		int n = c.length;

		char tmp = 'a';
		for(int i = 0;i<c.length/2;i++){
			tmp = c[i];
			c[i] = c[n-i-1];
			c[n-i-1] = tmp;
		}
		int prev = 0;
		for(int i = 0;i<c.length-1;i++){
			if(i!=prev &&c[i]==' '){
				reverse(c,prev,i-1);
				prev=i+1;
			}
		}
		String res = new String(c);
		return res;
	}
	private static void reverse(char[] c, int prev, int last) {
		char tmp = 'a';
		int leng = last-prev+1;
		for(int i = 0;i<leng/2;i++){
			tmp = c[prev+i];
			c[prev+i] = c[last-i];
			c[last-i] = tmp;
		}
	}

}
