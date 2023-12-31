import java.io.FileInputStream;
import java.io.BufferedInputStream;

class Test
{
public static void main(String arg[])
{
try
{
FileInputStream fis=new FileInputStream("hello.txt");

BufferedInputStream bis=new BufferedInputStream(fis);

int x=0;
while((x=bis.read())!=-1)
{
System.out.print((char)x);
}
System.out.println();
fis.close();
bis.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}

}
}
