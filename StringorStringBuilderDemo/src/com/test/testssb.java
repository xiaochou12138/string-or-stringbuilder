package com.test;

public class testssb {
	/** Creates a new instance of testssb */ 
	final static int ttime = 10000;// ����ѭ������ 
	public testssb() { 
	} 
	public void test(String s){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		s += "add"; 
		}
		long over = System.currentTimeMillis(); 
		System.out.println(" ���� "+s.getClass().getName()+" ����ʹ�õ�ʱ��Ϊ�� " + (over - begin) + " ���� " ); 
		} 
	
	public void test(StringBuffer s){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		s.append("add"); 
		} 
		long over = System.currentTimeMillis(); 
		System.out.println(" ���� "+s.getClass().getName()+" ����ʹ�õ�ʱ��Ϊ�� " + (over - begin) + " ���� " ); 
		} 
	
	public void test(StringBuilder s){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		s.append("add"); 
		} 
		long over = System.currentTimeMillis(); 
		System.out.println(" ���� "+s.getClass().getName()+" ����ʹ�õ�ʱ��Ϊ�� " + (over - begin) + " ���� " ); 
		} 
	
	// �� String ֱ�ӽ����ַ���ƴ�ӵĲ��� 
	public void test2(){ 
	String s2 = "abadf"; 
	long begin = System.currentTimeMillis(); 
	for(int i=0;i<ttime;i++){ 
	@SuppressWarnings("unused")
	String s = s2 + s2 + s2 ; 
	} 
	long over = System.currentTimeMillis(); 
	System.out.println(" �����ַ������������������ʹ�õ�ʱ��Ϊ�� " + (over - begin) + " ���� " ); 
	} 
	
	public void test3(){ 
		long begin = System.currentTimeMillis(); 
		for(int i=0;i<ttime;i++){ 
		@SuppressWarnings("unused")
		String s = "abadf" + "abadf" + "abadf" ; 
		} 
		long over = System.currentTimeMillis(); 
		System.out.println(" �����ַ������ʹ�õ�ʱ��Ϊ�� "+ (over - begin) + " ���� " ); 
		} 
	
}
