package com.phone;

public class Shop {

	public static void main (String[] Args){
		
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone(); 
		System.out.println(p);		
	}
}
