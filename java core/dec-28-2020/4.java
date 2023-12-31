class Test
{
public static void main(String arg[])
{
for(int i=1;i<=10;i++)
{
System.out.println("Slide="+i);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}

}
}
}
