package com.test;

public class initable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="abc"; 
		StringBuffer sb1 = new StringBuffer("abc"); 
		StringBuilder sb2 = new StringBuilder("abc"); 
		testssb t = new testssb(); 
		t.test(s1); 
		t.test(sb1);
		t.test(sb2); 
		t.test2(); 
		t.test3(); 
		
	}

}
