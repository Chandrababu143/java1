package InterviewProg;
import java.util.Scanner;
public class Railway {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter train time");
		int time=obj.nextInt();
		if(time%2==0)
		{
			System.out.println("Train i available");
		}
		else
		{
			System.out.println("Train is not available");
		}
		
	}

}
