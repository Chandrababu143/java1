package InterviewProg;
import java.util.*;
public class Medical {
	
	public static void main(String[] args) {
		long o=0,nmb=0;
	String grt=null;
			int lk=5;
			Scanner sc5=new Scanner(System.in);
		 while(lk>0) {
		try {
		 
			Class.forName("com.mysql.jdbc.Driver");
			Scanner sc=new Scanner(System.in);
			Scanner sc1=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
			//Class.forName("com.mysql.jdbc.driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Magicboy@123");
			Statement st=con.createStatement();
			
	CREATE TABLE IF NOT EXISTS patients (
		    patient_id INT PRIMARY KEY,
		    name VARCHAR(255),
		    age INT,
		    gender VARCHAR(10),
		    
		);

		CREATE TABLE IF NOT EXISTS doctors (
		    doctor_id INT PRIMARY KEY,
		    name VARCHAR(255),
		    specialization VARCHAR(255),
		    // Add more fields as needed
		);

		CREATE TABLE IF NOT EXISTS appointments (
		    appointment_id INT PRIMARY KEY,
		    patient_id INT,
		    doctor_id INT,
		    appointment_date DATE,
		    // Add more fields as needed
		    FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
		    FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
		);
		public class Patient {
		    private int patientId;
		    private String name;
		    private int age;
		    private String gender;

		    // Constructors, getters, setters
		}

		public class Doctor {
		    private int doctorId;
		    private String name;
		    private String specialization;

		 
		}
		
		}
		;

		public class PatientDAO {
		    private static final String INSERT_QUERY = "INSERT INTO patients (name, age, gender) VALUES (?, ?, ?)";
		    // Add more queries as needed

		    public void addPatient(Patient patient) {
		        {

		            statement.setString(1, patient.getName());
		            statement.setInt(2, patient.getAge());
		            statement.setString(3, patient.getGender());

		            statement.executeUpdate();

		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Add more methods for patient data manipulation
		}

}
