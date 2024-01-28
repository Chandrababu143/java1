package InterviewProg;

public class ArrayIndex {
public static void main(String args[]) {
	try {
		int a[]=new int[5];
		a[6]=11;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("exception handled");
		System.out.println("exception not handle");
		System.out.println("thankyou");
	}
}
}
