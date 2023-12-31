//DPA

class Foo
{
void m()
{
System.out.println("Hello Foo");
}
}

class Doo extends Foo
{

}



class Test
{
public static void main(String arg[])
{
Foo f=new Doo();
f.m();
}
}