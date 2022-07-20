package abc;
import java.io.*;

public class IOeg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader  r = new FileReader("E:\\ab.txt");
		
			int i =0;
			
			while((i = r.read())!=-1){
			System.out.print((char)i);
					}
			r.close();
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		
	}

}
