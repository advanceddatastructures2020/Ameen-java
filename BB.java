class A
{
int i, j;
void showij()
{
System.out.print("i= "+i+" "+"j="+j+" ");
}
}
class BB extends A
{
int k;
void showk()
{
System.out.print("k= "+k+"\n");
}
void sum()
{
System.out.print("i+j+k="+(i+j+k));
}
}