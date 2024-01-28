package InterviewProg;

public class Encapsulation {
public static void main(String args[]) {
	Encapsulated obj=new Encapsulated();
	obj.setName("chandrababu");
	obj.setAge(23);
	obj.setIfsc(74684);
	obj.setPin(1430);
	
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
	System.out.println(obj.getIfsc());
	System.out.println(obj.getPin());
	
	
}
}
