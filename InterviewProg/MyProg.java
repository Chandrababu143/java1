package InterviewProg;
import java.util.Scanner;
public class MyProg {
public static void main(String args[]) {
	Scanner Myobj=new Scanner(System.in);
	System.out.println("enter your weight");
	int weight=Myobj.nextInt();
	if (weight>=50) {
		System.out.println("not eligible");
	}
	else {
		System.out.println("eligible");
	}
}
}
