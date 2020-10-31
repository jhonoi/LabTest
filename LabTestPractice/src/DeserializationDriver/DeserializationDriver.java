package DeserializationDriver;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import Serialization.Employee;

public class DeserializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = null;
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Employees.ser"));
			emp = (Employee)is.readObject();
			is.close();
			System.out.println(emp.name);
		}catch(IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
