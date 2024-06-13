package javaPractice;


import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
public static void main(String[] args) {
RomanInteger.roman("MMXIV");
	
}

public static void roman(String s) {
	
	Map<Character, Integer> m=new HashMap<>();
	m.put('I' ,1 );
	m.put('V',5 );
	m.put('X',10 );
	m.put('L',50 );
	m.put('C',100 );
	m.put('D', 500);
	m.put('M',1000 );
	
	Integer result = m.get(s.charAt(s.length()-1));
	
	System.out.println(result);
}
}
