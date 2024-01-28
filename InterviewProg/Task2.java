package InterviewProg;

public class Task2 {
	public static void main(String[] args) {
		int a=18;
		int b=15;
		int c=5;
		
		
		a=a^b^c;
		b=a^b^c;
		c=a^b^c;
		a=a^b^c;
		
		System.out.println(c);

	}




}
