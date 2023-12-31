//Static Inner Class


class Room
{
static class Chair
{
void m()
{
System.out.println("Hello static inner class");
}
}
}


class Test
{
public static void main(String arg[])
{
//How to create static inner class object
//OCN.ICN refvar=new OCN.ICN();
Room.Chair rc=new Room.Chair();
rc.m();
}
}
