class Test
{
public static void main(String arg[])
{
System.out.println("Hii");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("Bye");
}
}
