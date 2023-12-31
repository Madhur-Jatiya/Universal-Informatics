//parameterized constructor

class Foo
{
Foo(int x,int y)
{
int z=x+y;
System.out.println("Add="+z);
}
}


class Test
{
public static void main(String arg[])
{
Foo f1=new Foo(10,20);
Foo f2=new Foo(100,200);
Foo f3=new Foo(1000,2000);
}
}