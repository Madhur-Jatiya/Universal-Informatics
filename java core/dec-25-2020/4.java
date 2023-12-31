abstract class Foo
{
abstract void m();
void n()
{
System.out.println("hello");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo()
{
void m()
{
System.out.println("welcome");
}
};
f.m();
f.n();
}
}
