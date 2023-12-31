//overriding also runtimepolymorphism

class Foo
{
int m(int a,int b)
{
return a+b;
}
}

class Doo extends Foo
{
int m(int a,int b)
{
return a*b;
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Doo();
int k=f.m(10,20);
System.out.println("value="+k);
}
}

