package InterviewProg;
 class CustomException extends Exception {
public CustomException(String message) {
	super(message);
}
}
public class ThrowExampleExceptions {
	public static void main(String args[]) {
		try {
			int age = -5;
			if(age<0) {
				throw new CustomException("age cannot be negattive");
			}
			System.out.println("age is:" + age);
		    }
		catch(Exception e) {
			System.out.println("CustomException caught:" + e.getMessage());
		}
	}
}

