//Member Inner Class


class Room
{
class Chair
{
void m()
{
System.out.println("Hello member class");
}
}
}


class Test
{
public static void main(String arg[])
{
//How to create member inner class object
//OCN.ICN refvar=new OCN().new ICN();
Room.Chair rc=new Room().new Chair();
rc.m();

}
}
