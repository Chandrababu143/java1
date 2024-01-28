package InterviewProg;
import java.util.*;
public class StackImplementation {
public static void main(String arg[]) {
	Stack<Integer> myobj=new Stack();
	myobj.push(10);
	myobj.push(9);
	myobj.push(8);
	myobj.push(7);
	myobj.push(6);
	myobj.push(5);
	
	System.out.println(myobj);
	System.out.println(myobj.pop());
	System.out.println(myobj.remove(2));
	System.out.println(myobj.peek());
	
	Iterator<Integer> it=myobj. iterator() ;
		while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
