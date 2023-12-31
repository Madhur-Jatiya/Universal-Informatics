//static block
class Foo
{
 static
    {
        System.out.println("Hello static block");
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