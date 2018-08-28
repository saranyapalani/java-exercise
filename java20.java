package javaman;

public class student14 {int id;  
	    String name;  
	    String city;  
	      
	    student14(int id,String name){  
	this.id = id;  
	    this.name = name;  
	    }  
    student14(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
     
	    public static void main(String args[]){  
	    student14 e1 = new student14(111,"saranya");  
    student14 e2 = new student14(222,"nidhi","bangalore");  
    e1.display();  
    e2.display();  
   }  

}
