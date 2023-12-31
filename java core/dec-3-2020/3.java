interface I1
{
void m();
}

interface I2 extends I1
{
void n();
}

class Foo implements I2
{
public void m()
{
System.out.println("Hello");
}
public void n()
{
System.out.println("Welcome");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
f.m();
f.n();
}
}




