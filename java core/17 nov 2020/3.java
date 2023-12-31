import java.util.Scanner;

class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);

int a[]=new int[5];
int i;
for(i=0;i<a.length;i++)
{
System.out.print("Enter value=");
a[i]=sc.nextInt();
}

for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}