package InterviewProg;
import java.util.*;
public class Nestedif {
public static void main(String args[]) {
	Scanner myobj=new Scanner(System.in);
	System.out.println("enter your age");
	int a=myobj.nextInt();
	System.out.println("enter your weight");
	int b=myobj.nextInt();
	if ((a>=90) && (b>=100)) {
		System.out.println("eligible");
	}
	else if((a<=70)&&(b>=100))
	{
		System.out.println("under age");
	}
	else if((a>=90)||(b>=80)) {
		System.out.println("under weight");
	}
	else {
		System.out.println("invalid");
	}
	
	
			
	
}
}
