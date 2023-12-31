//NullpointerException
class Foo
{
    void m()
        {
        System.out.println("Hello");
        }
}

class Test
    {
        public static void main(String arg[])
        {
            Foo f=new Foo();
            f=null;
            f.m();
        }
} 