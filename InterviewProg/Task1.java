package InterviewProg;

public class Task1 {
	public static void main(String[] args) {
		int a=18;
		int b=15;
		
		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println(a);
		System.out.println(b);

	}

}
