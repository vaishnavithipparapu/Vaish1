package com.vaish.demo;

 class Samp {
	 int a=10;
	 String s = "JAVA" ;
	 public void show()
	 {
		 System.out.println("The String value is: "+s);
	 }
 }
 public class Sample {
	 

	public static void main(String[] args) {
		Samp obj = new Samp();
		System.out.println(obj.a);
		obj.show();
	}

}
