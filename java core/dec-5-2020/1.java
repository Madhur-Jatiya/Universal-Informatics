interface I
{
static void m()
{
System.out.println("Hello static method");
}
}




class Test
{
public static void main(String arg[])
{
I.m();
}
}