import java.io.FileOutputStream;
import java.util.Scanner;

class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
try
{
FileOutputStream fos=new FileOutputStream("Hello.txt");
System.out.print("Enter which you would like to write in a file?");
String msg=sc.nextLine();

byte b[]=msg.getBytes();

fos.write(b);
System.out.println("Data has writed\n");
fos.flush();
fos.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
