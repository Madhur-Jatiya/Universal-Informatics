import java.io.FileInputStream;

class Test
{
public static void main(String arg[])
{
try
{
FileInputStream fis=new FileInputStream("simple_interest.txt");

int x=0;
while((x=fis.read())!=-1)
{
System.out.print((char)x);
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
