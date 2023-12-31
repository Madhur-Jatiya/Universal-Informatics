class A
{
void m()
{
System.out.println("Hello A");
}
}

class B extends A
{
void n()
{
System.out.println("Hello B");
}
}

class C extends A
{

void o()
{
System.out.println("Hello C");
}
}



class Test
{
public static void main(String arg[])
{
B b=new B();
b.m();
b.n();

C c=new C();
c.m();
c.o();
}
}








