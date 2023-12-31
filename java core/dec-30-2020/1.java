class Foo
{
synchronized public void wish(String name)
{
for(int i=1;i<=10;i++)
{
System.out.print("Good morning=");
try
{
Thread.sleep(1000);
}
catch(Exception e){}
System.out.println(name);
}
}
}

class MyThread extends Thread
{
Foo f;
String s;
MyThread(Foo f,String s)
{
this.f=f;
this.s=s;
}
public void run()
{
f.wish(s);
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();

MyThread mt1=new MyThread(f,"Kohli");
mt1.start();
MyThread mt2=new MyThread(f,"dhoni");
mt2.start();
MyThread mt3=new MyThread(f,"yuvraj");
mt3.start();
}
}


