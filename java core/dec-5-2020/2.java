interface I
{
default void m()
{
System.out.println("Hello non-static method");
}
}

class Foo implements I
{


}

class Test
{
public static void main(String arg[])
{
I i=new Foo();
i.m();
}
}