package javaexercise;

public class java22 {
	void m(java22 obj){  
			  System.out.println("method is invoked");  
			  }  
			  void p(){  
			  m(this);  
			  }  
			    
			  public static void main(String args[]){  
			  java22 s1 = new java22();  
		      s1.p();  
			  
		}

}
