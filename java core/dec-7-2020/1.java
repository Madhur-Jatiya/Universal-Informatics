/*
.non-static method's reference
.Method ref. only can apply in functional interface
.For achieveing method ref we can only give ref to abstract method of interface from another class's method of same type and same paramter. 
*/


interface I
{
void m();
}

class Foo 
{
void met()
{
System.out.println("Hello method reference");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();

I i=f::met;

i.m();

}
}