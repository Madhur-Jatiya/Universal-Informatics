interface I
{
int x=100;
}

class Test
{
public static void main(String arg[])
{
System.out.println(I.x);
//I.x++; error
}
}