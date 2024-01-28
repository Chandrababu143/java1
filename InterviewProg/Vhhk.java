package InterviewProg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner
public class Vhhk {
	public static void main(String args[]) {
		String Name=null;
		String RegNumber=null;
		String Department=null;
		String Grade=null;
		int Mark=0;
		int c=5;
		while(c>0) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connectwithsql=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","Vignesh07$");
		Statement statement = connectwithsql.createStatement();

		Scanner v1=new Scanner(System.in);
		Scanner v2=new Scanner(System.in);
		Scanner v3=new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.err.println("\n                  WELCOME TO OUR VikiCollege");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 . USER                                         2 . ADMIN");
		System.out.print("\n Students Click 1                       Admin Click 2 \n");
		

		System.out.print("\n      Enter : ");
		int type = v1.nextInt();
		if(type==1) {
			
			System.out.print("\n      Type Here : ");
			System.out.println("Enter Your Register Number");
			String RegisterNo=v1.next();
			ResultSet result=statement.executeQuery("Select * from grade where RegNo ='"+RegisterNo+"'");
       if( RegisterNo!= null) {
				System.err.print("\n       Wait just a second.");
				for(int i=1; i<=10; i++) {
					System.err.print(".");
					Thread.sleep(1000);
				}
			while(result.next()) {
				Name = result.getString(3);
				RegNumber = result.getString(2);
				Department = result.getString(4);
				Grade = result.getString(6);
				Mark=result.getInt(5);
				System.out.println("regno:"+result.getString(2)+"\t"+"Name :"+result.getString(3)+"\t"+"Department :"+result.getString(4)+"\t"+"Grade:"+ result.getString(6)+"\t"+"Mark:"+result.getInt(5));
			}
			System.out.println("\n      Logged in Successfully");
       }	
		}
		else if(type==2) {
			System.out.println("Admin name:");
			String Admin=v2.nextLine();
			System.out.println("password:");
			String pass=v2.nextLine();
			if(Admin.equals("VIKKI") && pass.equals("84259")) {
			System.out.println("\n   1.Add Student Details                 2.View Details ");
			System.out.println("\n            3.Delete Student Details    ");
			
			System.out.print("\n   Enter :    ");
			int res=v1.nextInt();
			if(res==1){
				System.out.print("\n     Register Number   : ");
				String regNumber = v2.nextLine();
				System.out.print("\n     Student Name   : ");
				String stdName = v2.nextLine();
				System.out.print("\n     Department      : ");
				String stdDept = v2.nextLine();
				System.out.print("\n     Mark    : ");
				int mark = v2.nextInt();
				String grade=null;
				
				if(mark>=80 || mark<=100) {
					grade="A";
				}
				else if(mark>=70||mark<80) {
					grade="B";
					
				}
				else if(mark>40||mark<70) {
					grade="C";
					
				}
				else {
					grade="fail";
					
				}
			
			String use="insert into grade(RegNo,Name,Department,Mark,grade)value('"+ regNumber+"','"+stdName+"','"+stdDept+"','"+mark+"','"+grade+"')";
			int i=statement.executeUpdate(use);
			
			if(i>0) {
				   System.err.print("\n      Your details are processing.");
				   for(int k=1;k<=10;k++) {
					   System.err.print(".");
					   Thread.sleep(1000);
				   }
				System.out.println("\n      Student Details Was Add successfully");
				
			   }
			   else {
				   System.err.println(" process");
			   }
			
		}	
		else if(res==2) {
			String showall = "select * from grade";
			ResultSet  vk=statement.executeQuery(showall);
			while(vk.next()) {
				System.out.println("regno :"+vk.getString(2)+"\t"+" NAME :"+vk.getString(3)+"\t"+"DEPT :"+vk.getString(4)+"\t"+"mark :"+vk.getString(5)+"\t"+"\t"+"grade :"+vk.getString(6));
			}
			
				System.out.println("\n ");
		}
		else if(res==3) {
			System.out.println("Enter your Register Number:");
			String reg=v2.nextLine();			
			String del="delete from  grade where regno='"+reg+"'";
			int a=statement.executeUpdate(del);
			if(a>0) {
				   System.err.print("\n      Details Are deleting....");
				   for(int j=1;j<=10;j++) {
					   System.err.print("details deleted...");
					   Thread.sleep(500);
				   }
		}
		}
			
		}
		else {
			for(int i=1; i<=1; i++) {
			Thread.sleep(1000);
			System.out.println("userName or PassWord inCorrect");
			}
		}
		}
		}
		catch (Exception e) {	 
			e.printStackTrace();
		}
		}
	}
}

