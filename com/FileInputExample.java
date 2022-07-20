package com;

import java.io.*;

public class FileInputExample {
	
	public void show() {
		try {
			FileInputStream f = new FileInputStream("E:\\ab.txt");
		//	int i = f.read();
			int j =0;
			while((j = f.read())!=-1) {
			System.out.print((char)j);
			}
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputExample e = new FileInputExample();
		e.show();
	}

}
