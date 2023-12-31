import java.util.Scanner;

class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter 1st value=");
        int x=sc.nextInt();
        
        System.out.print("Enter 2nd value=");
        int y=sc.nextInt();
        
        int z=x/y;        
        System.out.print("value="+z);       
        }
    }