package tpoint;
import javax.swing.*;  
public class MyTable {  
    JFrame f;  
MyTable(){  
    f=new JFrame();  
      
    String data[][]={ {"101","Aith","670000"},  
              {"102","Akash","780000"},  
                          {"103","Dhoni","700000"}};  
    String column[]={"ID","NAME","SALARY"};  
      
    JTable jt=new JTable(data,column);  
    jt.setBounds(30,40,200,300);  
      
    JScrollPane sp=new JScrollPane(jt);  
    f.add(sp);  
      
    f.setSize(300,400);  
//  f.setLayout(null);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyTable();  
}  
}  
