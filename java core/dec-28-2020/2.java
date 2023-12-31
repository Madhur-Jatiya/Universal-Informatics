class MyThread1 implements Runnable
{
public void run()
{
System.out.println("Sunday");
System.out.println("Monday");
System.out.println("Tuesday");
}
}

class MyThread2 implements Runnable
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

Thread t1=new Thread(mt1);
Thread t2=new Thread(mt2);

t1.start();
t2.start();
}
}
