package java19;

public class Thist { 
			    int id;  
			    String name;  
			      
    	    Thist(int id,String name){  
			    this.id = id;  
		    this.name = name;  
			    }  
			    void display(){System.out.println(id+" "+name);}  
			    public static void main(String args[]){  
			   Thist s1 = new Thist(111,"Ramesh");  
			    Thist s2 = new Thist(222,"Suresh");  
		        s1.display();  
			    s2.display();  
     	}  
			}  

