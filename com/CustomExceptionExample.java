package com;

import java.util.ArrayList;
import java.util.Arrays;

class MyCustom extends Exception{
	
	public MyCustom(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

public class CustomExceptionExample {
	
	ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java","php","dotnet","mysql"));
	
	public void check(String lang) throws MyCustom{
		if(arr.contains(lang)) {
			throw new MyCustom(lang + " already exists in the list");
		}
		else
		arr.add(lang);
		System.out.println(lang + " added successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionExample c = new CustomExceptionExample();
		try {
			c.check("andriod");
		
			c.check("Java");
		}	
		catch(MyCustom e) {
			System.out.println(e);
		}
	}

}
