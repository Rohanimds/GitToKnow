package practice;

import java.util.Scanner;

public class Test7 {
public static void main(String[] args) throws InterruptedException {

    Scanner scanner = new Scanner(System.in);
System.out.print("ROHAN:");
String input = scanner.nextLine();
String reversed = reverseString(input);
System.out.println("Reversed strinrg:" + reversed);
}
public static String reverseString(String str){
StringBuilder reversed = new StringBuilder();
for (int i = str.length() - 1; i >=0; i--) {
 reversed.append(str.charAt(i));
}
return reversed.toString();
}
}

