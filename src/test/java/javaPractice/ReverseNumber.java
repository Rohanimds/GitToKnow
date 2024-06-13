package javaPractice;

public class ReverseNumber {
public static void main(String[] args) {
	int i=550;
	int lastDigit=0;
	int reverse=0;
	while(i>0) {
		lastDigit=i%10;
		reverse=reverse*10+lastDigit;
		i=i/10;
	}
	System.out.println(reverse);
	
}
}
