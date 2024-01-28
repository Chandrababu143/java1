package InterviewProg;

public class Conductor {
String name;
int age;
int salary;

public Conductor() {
	name = "babu";
	age = 23;
	salary=2500;
}
public Conductor(String str,int a,int sal) {
	name= str;
	age = a;
	salary=sal;
}
public Conductor(Conductor other) {
	name=other.name;
	age=other.age;
}

public static void main(String args[]) {
	Conductor obj=new Conductor();
	System.out.println(obj.name);
	System.out.println(obj.age);
	Conductor obj1=new Conductor("magic",23,2500);
	System.out.println(obj1.name);
	System.out.println(obj1.age);
	System.out.println(obj1.salary);
	Conductor obj2=new Conductor(obj1);
	System.out.println(obj2.name);
	System.out.println(obj2.age);
	








}

}
    