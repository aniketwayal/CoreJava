package abc;

import java.io.*;
public class DeSerializeEg {

   public static void main(String [] args) {
      Employee1 e = null;
      try {
         FileInputStream fileIn = new FileInputStream("E://employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee1) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
   }
}
