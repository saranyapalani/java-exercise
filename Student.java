package java18;

public class Student{
		    int id;  
			    String name;  
		      
		    Student(int id,String name){  
		    id = id;  
		    name = name;  
			    }  
		    void display(){System.out.println(id+" "+name);}  
		  
			    public static void main(String args[]){  
		    Student s1 = new Student(345,"Saravanan");  
		    Student s2 = new Student(346,"Saranya");  
			    s1.display();  
			    s2.display();  
		    }  
}
  	


