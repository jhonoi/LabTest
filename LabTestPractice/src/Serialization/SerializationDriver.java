package Serialization;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.name = "Jiovani Tomlin";
		emp.address = "Jamaica";
		emp.trn = 1806481;
		emp.phoneNum = 5775652;
		emp.dob = "January 28, 2001";
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Employees.ser"));
			os.writeObject(emp);
			os.flush();
			os.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
