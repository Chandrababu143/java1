package InterviewProg;
import java.util.*;
public class Biodata2 {
public static void main(String args[]) {
	Scanner mm=new Scanner(System.in);
	System.out.println("enter name");
	String name=mm.next();
	System.out.println("enter age");
	int age=mm.nextInt();
	System.out.println("enter mob no");
	int mob=mm.nextInt();
	System.out.println("enter mail");
	String mail=mm.next();
	System.out.println("enter address");
	String add=mm.nextLine();
	String doorno=mm.nextLine();
	String district=mm.nextLine();
	String state=mm.nextLine();
	
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("mob no:"+mob);
	System.out.println("mail:"+mail);
	System.out.println("address:"+add);
	System.out.println(doorno);
	System.out.println(district);
	System.out.println(state);
	
}
}
