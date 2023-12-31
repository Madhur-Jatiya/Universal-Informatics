//ArrayStoreException

class Medicine{}
class Disprin extends Medicine{}
class Paracitamol extends Medicine{}

class Test
{
public static void main(String arg[])
    {
        Medicine m[]=new Disprin[5];

        m[0]=new Disprin();

        m[1]=new Disprin();

        m[2]=new Paracitamol();
    }
}