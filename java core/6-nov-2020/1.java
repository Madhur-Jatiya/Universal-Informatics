class A
{
void m()
{
System.out.println("Hello A");
}
}

class B extends A
{

}

class Test
{
public static void main(String arg[])
{
B b=new B();
b.m();
}
}