//nested foreach loop

class Test
{
public static void main(String arg[])
{
int a[][]={{1,2,3,4},{5,6,7,8},{9,1,2,3}};

for(int i[]:a)
{
for(int j:i)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}