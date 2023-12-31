import java.io.FileOutputStream;
import java.util.Scanner;

class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
try
{
FileOutputStream fos=new FileOutputStream("Add.txt");
System.out.print("Enter principle=");
int p=sc.nextInt();
System.out.print("Enter rate=");
int r=sc.nextInt();
System.out.print("Enter time=");
int t=sc.nextInt();

int si=p*r*t/100;
System.out.println("Addition="+si);

String ssii=String.valueOf(si);

ssii="SimpleInterest=".concat(ssii);




byte b[]=ssii.getBytes();

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
