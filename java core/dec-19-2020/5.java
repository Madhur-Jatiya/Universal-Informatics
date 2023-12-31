import java.util.Scanner;


class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter 1st value=");
int x=sc.nextInt();

System.out.println("Enter 2nd value=");
int y=sc.nextInt();

try{
int z=x/y;

System.out.println("value="+z);
}
catch(NullPointerException e)
{
System.out.println(e.toString());
}
finally
{
System.out.println("Chalega hi Chalega");
}
System.out.println("Program end");
}
}