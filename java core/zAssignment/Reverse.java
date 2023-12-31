class Reverse
{
public static void main(String arg[])
    {
        String s="hello how are you";
        String m[]=s.split(" ");
        for(int j=m.length-1;j>=0;j--)
        {
            System.out.print(m[j]+" "); 
        }
    }
}
