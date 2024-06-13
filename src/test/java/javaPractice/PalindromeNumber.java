package javaPractice;

public class PalindromeNumber {
public static void main(String[] args) {
	int i=1001;
	System.out.println(PalindromeNumber.palindrome(i));
	
}
public static boolean palindrome(int i) {
	int correctOrder = i;
	int lastDigit=0;
	int reverse=0;
	boolean result;
	while(i>0) {
		lastDigit=i%10;
		reverse=reverse*10+lastDigit;
		i=i/10;
	}
	System.out.println(reverse);
	if(correctOrder==reverse) {
//		System.out.println(correctOrder+" is a palindrome");
		result = true;
	}else {
//		System.out.println(correctOrder+" is not a palindrome");
	result=false;
	}
	return result;
}
}
