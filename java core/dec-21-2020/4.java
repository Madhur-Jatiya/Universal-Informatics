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

class Doo
{
void n()throws Exception
{
Foo f=new Foo();
f.m();
}
}

class Test
{
public static void main(String arg[])
{
Doo d=new Doo();
try
{
d.n();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("Program End");
}
}