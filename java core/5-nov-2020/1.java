import java.util.Scanner;


class Student
{
String name,contact,email;
int p,c,m,roll;
static int colid;
static{
colid=5001;
System.out.println("CollegeID="+colid);
}
Scanner sc=new Scanner(System.in);
{
System.out.print("Enter roll no=");
roll=sc.nextInt();
System.out.println("Roll No="+roll);
}

Student(String name1,String contact1,String email1)
{
name=name1;
contact=contact1;
email=email1;
personal();
}
Student(int p1,int c1,int m1)
{
p=p1;
c=c1;
m=m1;
academic();
}
void personal()
{
System.out.println("Name="+name);
System.out.println("Contact="+contact);
System.out.println("Email="+email);
}

void academic()
{
System.out.println("Physics="+p);
System.out.println("Chemistry="+c);
System.out.println("Maths="+m);

int per=(p+c+m)/3;
System.out.println("Percentage="+per);
}
}

class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for student personal detail and 2 for academic detail=");
int x=sc.nextInt();

if(x==1)
{
System.out.print("Enter name=");
String name=sc.next();
System.out.print("Enter Contact=");
String contact=sc.next();
System.out.print("Enter email=");
String email=sc.next();

Student s1=new Student(name,contact,email);

}
else if(x==2)
{
System.out.print("Enter physics marks=");
int p=sc.nextInt();
System.out.print("Enter chemistry marks=");
int c=sc.nextInt();
System.out.print("Enter maths marks=");
int m=sc.nextInt();
Student s2=new Student(p,c,m);

}
}
}