package com;

 class xyz {
	 String name ="Mamta";
	public void add( int n1, int n2) {
		
		int res = n1 + n2;
		System.out.println("Addition of method1 :" + res);
		
	}
	
 }

 class OverridingExample extends xyz{
	
	@Override
	public void add(int n1, int n2) {
		int res = n1 + n2;
		String name ="Ram";
		System.out.println("Addition of method1 :" + res);
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public static void main(String args[]) {
	//	OverridingExample e = new OverridingExample();
		xyz e = new OverridingExample();
		
		
		
	e.add(45, 78);
		e.add(81, 95);
	}
	
}
