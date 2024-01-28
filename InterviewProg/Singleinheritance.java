package InterviewProg;

 class ParentSi {
	int age=56;
	void Parentclass() {
		System.out.println("base class");
	}

}

class ChildSi extends ParentSi{
	int ag=12;
	void childClass() {
		System.out.println("derived class");
	}
}

public class Singleinheritance {
	public static void main(String args[]) {
		ChildSi ch = new ChildSi();
		ch.childClass();
		ch.Parentclass();
		System.out.println(ch.age);
		System.out.println(ch.ag);
	}
}