package javaPractice;

import java.util.Arrays;

public class LongestCommonPrifix {
public static void main(String[] args) {
	String[] s= {"hello","hell","help"};
	String result = LongestCommonPrifix.longest(s);
	System.out.println(result);
}
	public static String longest(String[] s) {
	
	StringBuilder sb=new StringBuilder();
	
	Arrays.sort(s);
	
	char[] first = s[0].toCharArray();
	char[] last = s[s.length-1].toCharArray();
	
	for(int i=0;i<first.length;i++) {
		if(first[i]!=last[i]) {
			break;
		}
		sb.append(first[i]);
	}
	return sb.toString();
	
	
}
}
