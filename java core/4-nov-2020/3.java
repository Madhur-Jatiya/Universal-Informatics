import java.util.Scanner;

class Student
{
int p,c,m;
Scanner sc=new Scanner(System.in);

Student()
{
System.out.print("Enter Physics marks=");
p=sc.nextInt();

System.out.print("Enter Chemistry marks=");
c=sc.nextInt();

System.out.print("Enter Maths marks=");
m=sc.nextInt();
}

void show()
{
System.out.println("Physics="+p);
System.out.println("Chemistry="+c);
System.out.println("Maths="+m);
}


void calculatePer()
{
int per=(p+c+m)/3;
System.out.println("Percentage="+per);
}
}


class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1 for show marks and 2 for show percentage=");
int x=sc.nextInt();
Student s=new Student();

if(x==1)
{
s.show();
}
else if(x==2)
{
s.calculatePer();
}
else 
{
System.out.println("U entered invalid option");
}
}
}


