package InterviewProg;
import java.util.Scanner;
public class Train {
public static void main(String args[]) {
	Scanner Time = new Scanner(System.in);
	System.out.println("enter your time");
	int a=Time.nextInt();
	if (a%3==1) {
		System.out.println("Train not available");
	}
	else {
		System.out.println("train available");
	}
}
}
