package InterviewProg;
import java.util.*;
public class BioData {
public static void main(String args[]) {
	Scanner data=new Scanner(System.in);
	System.out.println("enter your name");
	String name=data.next();
	System.out.println("enter your age");
	int age=data.nextInt();
	System.out.println("enter your mail");
	String mail=data.next();
	System.out.println("enter your mob num");
	int mob=data.nextInt();
	System.out.println("enter your address");
	String add=data.nextLine();
	String doorno=data.nextLine();
	String district=data.nextLine();
	String state=data.nextLine();
	
	System.out.println("Name:"+name);
	System.out.println("age:"+age);
	System.out.println("mail:"+mail);
	System.out.println("mob num :"+mob );
	System.out.println("address:");
	System.out.println(doorno);
	System.out.println(district);
	System.out.println(state);
	
	
	
}
}
