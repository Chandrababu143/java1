package InterviewProg;

public class MeticExx {
public static void main(String args[]) {
	int a=11;
	int b=0;
	
	
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("exception handled");
	}
	System.out.println("hello all");
}
}
