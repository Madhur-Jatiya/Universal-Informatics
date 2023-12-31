/*
.non-static method's reference
.Method ref. only can apply in functional interface
.For achieveing method ref we can only give ref to abstract method of interface from another class's method of same type and same paramter. 
*/

interface I
{
int m(int a,int b);
}

class Foo 
{
int met(int c,int d)
{
return c+d;
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();

I i=f::met;

int k=i.m(10,20);
System.out.println("Value="+k);
}
}