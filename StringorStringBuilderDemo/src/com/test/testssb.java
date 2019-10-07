package com.test;

public class testssb {
	/** Creates a new instance of testssb */ 
	final static int ttime = 10000;// 测试循环次数 
	public testssb() { 
	} 
	public void test(String s){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		s += "add"; 
		}
		long over = System.currentTimeMillis(); 
		System.out.println(" 操作 "+s.getClass().getName()+" 类型使用的时间为： " + (over - begin) + " 毫秒 " ); 
		} 
	
	public void test(StringBuffer s){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		s.append("add"); 
		} 
		long over = System.currentTimeMillis(); 
		System.out.println(" 操作 "+s.getClass().getName()+" 类型使用的时间为： " + (over - begin) + " 毫秒 " ); 
		} 
	
	public void test(StringBuilder s){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		s.append("add"); 
		} 
		long over = System.currentTimeMillis(); 
		System.out.println(" 操作 "+s.getClass().getName()+" 类型使用的时间为： " + (over - begin) + " 毫秒 " ); 
		} 
	
	// 对 String 直接进行字符串拼接的测试 
	public void test2(){ 
	String s2 = "abadf"; 
	long begin = System.currentTimeMillis(); 
	for(int i=0;i<ttime;i++){ 
	@SuppressWarnings("unused")
	String s = s2 + s2 + s2 ; 
	} 
	long over = System.currentTimeMillis(); 
	System.out.println(" 操作字符串对象引用相加类型使用的时间为： " + (over - begin) + " 毫秒 " ); 
	} 
	
	public void test3(){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		@SuppressWarnings("unused")
		String s = "abadf" + "abadf" + "abadf" ; 
		} 
		long over = System.currentTimeMillis(); 
		System.out.println(" 操作字符串相加使用的时间为： "+ (over - begin) + " 毫秒 " ); 
		} 
	
}
