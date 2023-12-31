class MyThread extends Thread
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
MyThread mt=new MyThread();
mt.start();

System.out.println("sunday");
System.out.println("monday");
System.out.println("Tuesday");

}
}
