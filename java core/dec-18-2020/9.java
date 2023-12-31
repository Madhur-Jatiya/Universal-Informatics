//classCastException

class Amitabh{}

class Jaya extends Amitabh{}

class Rekha extends Amitabh{}



class Test
{
public static void main(String arg[])
{
Amitabh a=new Jaya();

Jaya j=(Jaya)a;
Rekha r=(Rekha)a;
}
}