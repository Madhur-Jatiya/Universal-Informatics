interface I
{
void m();
}


class Foo implements I
{
public void m()
{
System.out.println("Hello");
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




