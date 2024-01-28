package InterviewProg;
import java.util.Scanner;
public class Task3 {
	
public static void main(String args[]) {	
				Scanner sn=new Scanner(System.in);
				System.out.println("enter the time:");
				int a=sn.nextInt();
				if (a%2==0)
				{
					System.out.println("train available");
				}
				else
				{
					System.out.println("not available");
				}
		}

	}

