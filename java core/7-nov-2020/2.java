//method overloading
class Foo
{
void m()
{
System.out.println("Hello");
}
void m(int a,int b)
{
int c=a+b;
System.out.println("Add="+c);
}
void m(int p,int r,int t)
{
int si=p*r*t/100;
System.out.println("Simple Interest="+si);
}
}


class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
f.m(10,20);
f.m();
f.m(1000,2,3);
}
}
