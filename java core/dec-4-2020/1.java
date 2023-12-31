interface I1
{
void m();
}

interface I2 
{
void n();
}

class Doo
{
void o()
{
System.out.println("Hello Doo");
}
}
class Foo extends Doo implements I1,I2 
{
public void m()
{
System.out.println("Hello");
}
public void n()
{
System.out.println("welcome");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
f.m();
f.n();
f.o();
}
}




