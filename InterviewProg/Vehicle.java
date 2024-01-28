package InterviewProg;

class Bike {
void run() {
	System.out.println("vehicle is running");
}
}
public class Vehicle extends Bike {
	public static void main(String args[]) {
		Vehicle obj=new Vehicle();
		obj.run();
	}
}
