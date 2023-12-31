//single class
//Lazy initialization

class Foo 
{
    private static Foo f;    
    private Foo(){}
    public static Foo getInstance()
    {
        if(f==null)
        {
            f = new Foo();
        }
        return f;
    }
}


class Test
{
public static void main(String arg[])
{
Foo f1=Foo.getInstance();
Foo f2=Foo.getInstance();
System.out.println(f1);
System.out.println(f2);
}
}