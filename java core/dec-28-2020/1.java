class MyThread1 extends Thread
{
public void run()
{
System.out.println("Sunday");
System.out.println("Monday");
System.out.println("Tuesday");
}
}

class MyThread2 extends Thread
{
public void run()
{
System.out.println("One");
System.out.println("Two");
System.out.println("Three");
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
