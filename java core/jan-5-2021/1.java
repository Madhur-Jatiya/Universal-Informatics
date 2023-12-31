import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.BufferedOutputStream;
class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
try
{
FileOutputStream fos=new FileOutputStream("hello.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos);

System.out.print("Enter message=");
String msg=sc.nextLine();




byte b[]=msg.getBytes();

bos.write(b);
System.out.println("Data has writed\n");
bos.flush();
fos.close();
bos.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
