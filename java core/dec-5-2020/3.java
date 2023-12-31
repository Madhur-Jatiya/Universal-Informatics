interface I
{
default void m()
{
System.out.println("Hello non-static method");
}
}

class Foo implements I
{
public void m()
{
System.out.println("Hello overrided non-static method");
}
}

class Test
{
public static void main(String arg[])
{
I i=new Foo();
i.m();
}
}