package javaman;

public class java21 { 
			  void m(){  
			  System.out.println("method is invoked");  
			  }  
			  void n(){  
			  this.m();//no need because compiler does it for you.  
			  }  
	    	  void p(){  
	    	  n();//complier will add this to invoke n() method as this.n()  
			  }  
			  public static void main(String args[]){  
			  java21 s1 = new java21();  
			  s1.p();  
			  }  

}
