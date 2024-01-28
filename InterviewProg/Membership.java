package InterviewProg;
import java.util.Scanner;
public class Membership {
public static void main(String args[]) {
	Scanner z=new Scanner(System.in);
	System.out.println("enter your age");
	int age=z.nextInt();
	
	if(age>=18) 
	{
		System.out.println("you will get a membership card (yes/no)");
		String member=z.next();
	
		if (member.equals("yes")) {
			System.out.println("you get 15% offer");
			
		}
		else {
			System.out.println("you get a 10% offer");
		}
	}
	else
	{
		System.out.println("Get out");
	}
	
}
}
