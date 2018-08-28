package pack;

public class Table {
	synchronized void printTable(int n){//synchronized method  
		   for(int i=n;i<=10;i=i+2){  
		     System.out.println(i);  
		     try{  
		      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  

