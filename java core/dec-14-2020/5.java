//split()->It split the string into saveral parts.

class Test
{
public static void main(String arg[])
{
String s="Hello its monday today and its so awsome day and its so cold outside";

String ss[]=s.split("its");

for(int i=0;i<ss.length;i++)
{
System.out.println(ss[i]);
}
}
}