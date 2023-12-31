class Room
{
    private int x=100;
    void m()
 {
    int y=200;
 
    class Chair
     {
        int z=300;
        void n()
        {
            System.out.println("Value="+x);
            System.out.println("Value="+y);
            System.out.println("Value="+z);
        }
     }

    Chair c=new Chair();
    c.n();
 }
}

class Test
{
public static void main(String arg[])
{
    Room r=new Room();
    r.m();
}
}
