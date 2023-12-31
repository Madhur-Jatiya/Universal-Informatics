//static var

class Foo
{
static int x=100;

void m()
{
System.out.println(x);
}

void n()
{
x=x+100;
System.out.println(x);
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
f.m();
f.n();
Foo.x=Foo.x+100;
System.out.println(Foo.x);
}
}