package com;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("E://demo.txt");
			
			/*
			 * if(f.createNewFile()) { System.out.println("New File created"); } else
			 * System.out.println("File exists");
			 */
			
			File f1 = f.getCanonicalFile();
		System.out.println(f1);
			boolean b = false;
			b = f1.exists();
			
			//or
			String path ="";
			path = f1.getAbsolutePath();
			if(b) {
				System.out.println(path);
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
