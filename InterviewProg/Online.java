package InterviewProg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Online {	
	public static void main(String args[]) {
		String Name=null;
		String mobNumber=null;
		String Course=null;
		String Fees=null;
		int c=5;
		while(c>0) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connectwithsql=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","Magicboy@123");
		Statement statement = connectwithsql.createStatement();

		Scanner v1=new Scanner(System.in);
		Scanner v2=new Scanner(System.in);
		Scanner v3=new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.err.println("\n                  WELCOME TO OUR MicroCollege");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 . USER                                         2 . ADMIN");
		System.out.print("\n Students Click 1                       Admin Click 2 \n");
		

		System.out.print("\n      Enter : ");
		int type = v1.nextInt();
		if(type==1) {
			
			System.out.print("\n      Type Here : ");
			System.out.println("Enter Your name");
			String name=v1.next();
			System.out.println("Enter your mobile number :");
			long mobnumber=v1.nextInt();
			System.out.println("Enter the course :");
			String course=v1.next();
			System.out.println("your Qualification:");
			String degree=v1.next();
			System.out.println("enter your age :");
			int age=v1.nextInt();
			System.out.println("gender");
			String gen=v1.next();
			

			String use="insert into minicollege(Name,mobnumber,course,degree,age,gender,)value('"+ name+"','"+mobnumber+"','"+course+"','"+degree+"','"+age+"','"+gen+"')";
			int i=statement.executeUpdate(use);
			
			if(i>0) {
				   System.err.print("\n      Your details are processing.");
				   for(int k=1;k<=10;k++) {
					   System.err.print(".");
					   Thread.sleep(1000);
				   }
				System.out.println("\n      Student Details Was Add successfully");
			
			
		}
		}
		else if(type==2){
			System.out.println("enter admin name :");
			String name=v1.next();
			System.out.println(" enter password:");
			String pass=v2.nextLine();
			if(name.equals("babu") && pass.equals("1430")) {
			System.out.println("\n   1.course and fees Details                2.View Student application");
			System.out.println("\n            3.Delete Student Details    ");
			
			System.out.println("Click here:");
			int res=v1.nextInt();
			if(res==1) {
				System.out.println("\n   1.FullStack               2.web");
				System.out.println("\n            3.Delete Student Details    ");
			}
		}
		
}
		}
		}
	}