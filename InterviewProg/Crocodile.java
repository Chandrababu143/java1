package InterviewProg;
import java.util.*;
public class Crocodile {
public static void main(String args[]) {
	Scanner x=new Scanner(System.in);
	System.out.println("rescue my dog");
	System.out.println("enter time");
	String a=x.next();
	switch (a) {
	case ("morning"):
		System.out.println("7 0 clock");
	break;
	case ("afternoon"):
		System.out.println("12 o clock");
	break;
	case ("evening"):
		System.out.println("4 o clock");
	break;
	case ("night"):
		System.out.println("8 o clock");
	break;
	default :
		System.out.println("invalid");
	}
	
}
}
