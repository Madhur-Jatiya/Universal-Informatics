//non-static block
class Foo
{
{
System.out.println("Hello non-static block");
}
}

class Test
{
public static void main(String arg[])
{
Foo f1=new Foo();
Foo f2=new Foo();
}
}