class MyThread extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Rama");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
}


class Test
{
public static void main(String arg[])
{
MyThread mt=new MyThread();
mt.start();

for(int i=1;i<=10;i++)
{
System.out.println("Seeta");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
}
