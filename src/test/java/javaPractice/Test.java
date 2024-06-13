package javaPractice;

public class Test {
	
public static void main(String[] args) {
int num=12;

int flag=0;
int i;
for(i=2;i<num;i++) {
	if(num%i==0) {
		System.out.println(num+" Its a not prime");
		flag=1;
		break;
	}
	
}
if(flag==0) {
	System.out.println(num+" Its a prime");
}
}
}