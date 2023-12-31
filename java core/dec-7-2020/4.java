/*
.Constructor's reference
.Method ref. only can apply in functional interface
.For achieveing method ref we can only give ref to abstract method of interface from another class's method of same type and same paramter. 
*/


interface I
{
void m();
} 

class Foo 
{
Foo()
{
System.out.println("Hello method reference");
}
}

class Test
{
public static void main(String arg[])
{
I i=Foo::new;
i.m();
}
}