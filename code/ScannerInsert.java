import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ScannerInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// load driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection with DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itv", "root","");
			
			System.out.println("Connection established ");
			
			PreparedStatement st = con.prepareStatement("insert into student values (?,?,?,?)");
			
			Scanner s = new Scanner(System.in);
			
			do {
			System.out.println("enter student id");
			int id = s.nextInt();
			
			System.out.println("enter student name");
			String ename = s.next();
			
			System.out.println("Enter student email ");
			String email = s.next();
			
			System.out.println("enter student phone number");
			long phone = s.nextLong();
			
			st.setInt(1, id);
			st.setString(2, ename);
			st.setString(3, email);
			st.setLong(4, phone);
			
			st.executeUpdate();
			System.out.println("inserted");
			
			System.out.println("Do you to insert more : y/n");
			String choose = s.next();
			
			if (choose.startsWith("n")) {
				break;
			}
			}
			while(true);
			
			con.close();
			
	}
		catch(Exception e) {
			System.out.println(e);
			}
		}

}
