import java.util.Scanner;

class Foo
{
void m()throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st value=");
int x=sc.nextInt();

System.out.print("Enter 2nd value=");
int y=sc.nextInt();

int z=x/y;

System.out.println("Value="+z);
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
try
{
f.m();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("Program End");
}
}