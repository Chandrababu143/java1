package InterviewProg;

abstract class Playboys {
	abstract void samdaniel();
	abstract void srinath();
	void abi() {
		System.out.println("loves in many girls");
	}
}
public class Abstract extends Playboys {
	@Override
	void samdaniel() {
		System.out.println("propose in many girls");
	}

	@Override
	void srinath() {
		System.out.println("no lovers always single");
	}
	public static void main(String args[]) {
		Abstract obj=new Abstract();
		obj.samdaniel();
		obj.srinath();
		obj.abi();
	}

	
}
