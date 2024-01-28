package InterviewProg;

public class Revir {
public static void main(String args[]) {
	String name="meow";
	String cat="";
	System.out.println("reverse word:"+name);
	for(int i=0;i<name.length();i++) {
		cat=name.charAt(i)+cat;
	}
	System.out.println("reversed:"+cat);
}
}
