//non-static var

class Foo
{
int x=100;

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
f.x=f.x+100;
System.out.println(f.x);
}
}