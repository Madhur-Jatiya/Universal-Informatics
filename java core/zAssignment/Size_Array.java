import java.util.Scanner;

class Master
{
    public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);

            int size;
            System.out.print("Enter size=");
            size=sc.nextInt();

            int c[]= new int[size];

            for(int i=0;i<size;i++)
            {
                System.out.print("value=");
                c[i]=sc.nextInt();
            }
          
            System.out.println("");

            for(int j=0;j<size;j++)
            {
            System.out.println("value="+c[j]);
            }
        }
}