class MyThread1 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Rama");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
}

class MyThread2 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Seeta");
try
{
Thread.sleep(3000);
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
MyThread1 mt1=new MyThread1();
MyThread2 mt2=new MyThread2();
mt1.start();
mt2.start();
}
}
