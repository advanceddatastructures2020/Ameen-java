class SimpleInheritance
{
public static void main(String args[])
{
A superOb=new A();
BB subOb=new BB();
superOb.i=10;
superOb.j=20;

System.out.print("Contents of superOb\n");
superOb.showij();
subOb.i=2;
subOb.j=3;
subOb.k=4;

System.out.print("\n contents of subOb\n");
subOb.showij();
subOb.showk();

System.out.print("i+j+k in subOb:");
subOb.sum();
}
}