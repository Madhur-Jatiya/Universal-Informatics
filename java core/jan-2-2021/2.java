import java.io.FileInputStream;

class Test
{
public static void main(String arg[])
{
try
{
FileInputStream fis=new FileInputStream("simple_interest.txt");

int x=fis.read();

System.out.println("value="+(char)x);

x=fis.read();

System.out.println("value="+(char)x);

x=fis.read();

System.out.println("value="+(char)x);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
