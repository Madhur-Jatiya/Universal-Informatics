//lamda expression(only apply in functional interface)

interface I
{
void m(int a,int b);
}

class Test
{
public static void main(String arg[])
{
I i=(int a,int b)->{
int c=a+b;
System.out.println("Add="+c);
};

i.m(10,20);

}
}


