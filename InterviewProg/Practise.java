package InterviewProg;

interface Rat{
	abstract void myMethod();
}
interface Snake{
	abstract void My();


public class Practise implements Rat,Snake{
	@Override
	public void My() {
		System.out.println("hello");
		
	}

	@Override
	public void myMethod() {
	System.out.println("hi");
		
	}
	
	
	public static void main(String args[]) {
		
		Practise ra = new Practise();
		
		ra.My();
		ra.myMethod();
		
		
		
		
	}

	

}
