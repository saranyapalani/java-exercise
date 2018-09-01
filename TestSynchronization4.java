package zxc;

public class TestSynchronization4 {
		public static void main(String t[]){  
			MyThread11 t1=new MyThread11();  
			MyThread22 t2=new MyThread22();  
			MyThread3 t3=new MyThread3();  
			MyThread4 t4=new MyThread4();  
			t1.start();  
			t2.start();  
			t3.start();  
			t4.start();  
			}  
			}  

