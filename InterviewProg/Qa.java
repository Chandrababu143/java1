package InterviewProg;

public class Qa {
public static void main(String args[]) {
	
	int row=5;
	for(int a=0;a<row;a++) {
		for(int b=row-a;b>1;b--) {
			System.out.print(" ");
		}
		for(int c=0;c<=a;c++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
