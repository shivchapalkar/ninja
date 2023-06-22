class A
{
public static void main(String [] args)
{
int a=10, b=5, c=5;
int x,y;
try
{
 x=a/(b-c);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index error");
}
catch(ArithmeticException e)
{
System.out.println("Error");
}
finally
{
 y=a/(b+c);
System.out.println("y="+y);
}
}
}