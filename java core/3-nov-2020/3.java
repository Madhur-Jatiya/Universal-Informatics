//non-static method

class Foo
{
void m()
{
System.out.println("hello all");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
f.m();
}
}