import java.util.Scanner;

class College
{

String name,email;
String mobile;

Scanner sc=new Scanner(System.in);
College()
{  
   

  System.out.print("enter your name :");
  name  = sc.next();

   System.out.print("enter your email :");
   email  = sc.next();
  
   System.out.print("enter your mobile no :");
   mobile = sc.next();
}
void putCollege()
{
System.out.println("Name = :" +name);
System.out.println("email = :" +email);
System.out.println("Mobile no = :" +mobile);
}
}
class Btech extends College
{
int p,c,m;
Btech()
{

System.out.print("enter your physics marks :");
 p  = sc.nextInt();

System.out.print("enter your chemistry marks :");
 c = sc.nextInt();

System.out.print("enter your Maths marks :");
 m  = sc.nextInt();
}

void putBtech()
{
putCollege();
System.out.println("physics marks = :" +p);

System.out.println("chemistry  marks = :" +c);

System.out.println("Maths marks= :" +m);

int per=(p+c+m)/3;
System.out.println("parcentage= :" +per);

if(per>=70)
{
System.out.println("since your percentage is greater then 70 ");
System.out.println("your admission is confirm");
}
else
{
System.out.println("since your percentage is less then 70 ");
System.out.println("your admission is not confirm");
}
}
}

class Bcom extends College
{
	
int acc,mang,eco;
Bcom()
{
System.out.println("enter your accounts marks ->");
acc = sc.nextInt();

System.out.println("enter your management marks ->");
mang  = sc.nextInt();

System.out.println("enter your economics marks ->");
eco  = sc.nextInt();
}

void putBcom()
{

putCollege();

System.out.println("account marks is -> " +acc);
System.out.println("management marks is -> " +mang);
System.out.println("economics marks is -> " +eco);
int per=(acc+mang+eco)/3;

System.out.println("parcentage= :" +per);

if(per>=70)
{
System.out.println("since your percentage is greater then 70 ");
System.out.println("your admission is confirm");
}
else
{
System.out.println("since your percentage is less then 70 ");
System.out.println("your admission is not confirm");
}
}
}


class BA extends College
{
	
int h,c,g;
BA()
{
System.out.println("enter your history marks ->");
h = sc.nextInt();

System.out.println("enter your civics marks ->");
c = sc.nextInt();

System.out.println("enter your geography marks ->");
g = sc.nextInt();

}

void putBA()
{


System.out.println("history marks is -> " +h);
System.out.println("civics marks is -> " +c);
System.out.println("geography marks is -> " +g);
int per=(h+c+g)/3;

System.out.println("parcentage= :" +per);

if(per>=70)
{
System.out.println("since your percentage is greater then 70 ");
System.out.println("your admission is confirm");
}
else
{
System.out.println("since your percentage is less then 70 ");
System.out.println("your admission is not confirm");
}
}
}

class Test
{
public static void main(String arg[])
{
int x;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 for BTech ,2 for Bcom and 3 for BA addmission ");
x  = sc.nextInt();

if(x==1)
{
Btech bt = new Btech();
bt.putBtech();
}
else if(x==2)
{
	Bcom bc = new Bcom();
bc.putBcom();
	
}	
else if(x==3)
{
	BA ba = new BA();
ba.putBA();
	
}
}
}

