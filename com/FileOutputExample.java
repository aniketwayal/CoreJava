package com;
import java.io.*;

public class FileOutputExample {
	
	public void show() {
		try {
			FileOutputStream f = new FileOutputStream("E:\\ab.txt");
		//f.write(67);
			String s = "I am Mamta";
			byte b[] = s.getBytes();
			f.write(b);
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("msg written successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputExample o = new FileOutputExample();
		o.show();
	}

}
