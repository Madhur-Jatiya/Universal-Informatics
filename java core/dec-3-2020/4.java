interface I1
{
void m();
}

interface I2 
{
void m();
}

class Foo implements I1,I2
    {
        public void m()
            {
                System.out.println("Hello");
            }
    }

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
f.m();
}
}