//how to access a normal method and abstract of abstract class 
abstract class Foo
{
abstract void m();
void n()
{
System.out.println("Hello normal method");
}
}

class Doo extends Foo
{
void m()
{
System.out.println("Hello abstract method");
}
}


class Test
{
public static void main(String arg[])
{
Doo d=new Doo();
d.m();
d.n();
}
}