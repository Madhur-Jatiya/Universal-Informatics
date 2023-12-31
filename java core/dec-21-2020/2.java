class Test
{
public static void main(String arg[])
{
int x=12,y=0;

try
{
int z=x/y;
System.out.println("Value="+z);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero");
}
}
}