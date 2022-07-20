package com;

  interface mickey {  //parent1
	 
	 public default void teddy() {
		 System.out.println("I am default interface of teddy()");
	 }
	 
	 public static void unicorn() {
		 System.out.println("I am static interface of unicorn()"); 
	 }
	 

  interface mickey1{  //parent2
	 
	 public void panda();

  }	
}