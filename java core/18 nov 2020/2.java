import java.util.Scanner;

class Test
{
public static void main(String arg[])
{
int a[][]=new int[3][4];
Scanner sc=new Scanner(System.in);

for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
System.out.print("Enter value=");
a[i][j]=sc.nextInt();
}
}

System.out.println();

for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}