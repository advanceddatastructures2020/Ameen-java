//implementing access specifier

class A{  
private int data=40;  
void msg()
 {
   System.out.println("Hello java");
 }  
}  
  
public class Accessspecifier{  
 public static void main(String args[]){  
   A obj=new A();  
   obj.msg();
   }  
}  