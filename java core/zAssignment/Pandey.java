import java.util.Scanner;
class Pandey
{
public static void main(String arg[])
    {
        int x=0,y=0;

        String c[]=new String[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++)
            {
                System.out.print("Enter the value=");
                c[i]=sc.nextLine();
            }

        System.out.println("");

        for(int j=0;j<10;j++)
            {
                System.out.println("value="+c[j]);
            }

        System.out.println("");
        
        for(int k=0;k<10;k++)
            {
                if(c[k].endsWith("Pandey"))
                    {
                        x=x+1;
                    }
                
                else if(c[k].endsWith("pandey"))
                    {
                        x=x+1;
                    }

                else
                    {
                        y=y+1;
                    }
            }

            System.out.println("No.of person Who's Surname is Pandey="+x);
            System.out.println("");
            System.out.println("Rest person Who's Surname is not Pandey="+y);
            System.out.println("");
    }
}