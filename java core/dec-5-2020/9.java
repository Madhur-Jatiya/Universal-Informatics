//lamda expression(only apply in functional interface)

interface I
{
int m(int a,int b);
}

class Test
{
public static void main(String arg[])
{
I i=(a,b)->(a*b);

int x=i.m(10,20);
System.out.println("Value="+x);
}
}


