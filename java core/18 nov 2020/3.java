//array's of array

class Test
{
public static void main(String arg[])
{
int a[][]={{1,2,3,4},{5,6,7},{9,1,2,3,8}};

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}