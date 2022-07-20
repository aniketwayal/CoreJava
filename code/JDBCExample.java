
import java.sql.*;

public class JDBCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// load driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection with DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itv", "root","");
			
			System.out.println("Connection established ");
			
		Statement st = con.createStatement();
//			st.executeUpdate("insert into student values (1,'Mamta', 'mam@gmail.com', 7896541200)");
//			System.out.println("data inserted successfully");
			
	//	st.executeUpdate("update student SET email='ram@gmail.com' where id=2 ");
		//System.out.println("data updated successfully");
		
		st.executeUpdate("delete from student where id =2");
		System.out.println("deleted successfully");
	
		
			ResultSet s = st.executeQuery("Select * from student");
			
			while (s.next()) {
				System.out.println(s.getInt(1) + " " + s.getString(2) + " " + s.getString(3) + " " + s.getLong(4));
			}
			
			
			con.close();
		}
		catch(Exception e ) {
			System.out.println(e);
		}
	}

}
