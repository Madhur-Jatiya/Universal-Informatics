//Method overriding

class Foo
{
void m()
{
System.out.println("Hello Foo");
}
}

class Doo extends Foo
{
void m()
{
System.out.println("Hello Doo");
}
}



class Test
{
public static void main(String arg[])
{
Doo d=new Doo();
d.m();
}
}