//lamda expression(only apply in functional interface)

interface I
{
void m();
}


class Test
{
public static void main(String arg[])
{
I i=()->{
System.out.println("Hello");
};

i.m();

}
}


