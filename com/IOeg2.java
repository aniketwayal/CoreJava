package abc;
import java.io.*;

public class IOeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w = new FileWriter("E:\\ab.txt");
		String s = "My name is Mamta";
		w.write(s);
		w.close();
		
		System.out.println("Success");
		
		
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		
	}

}
