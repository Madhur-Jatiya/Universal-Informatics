//Static Inner Class


class Room
{
static class Chair
{
static void m()
{
System.out.println("Hello static method of static inner class");
}
}
}


class Test
{
public static void main(String arg[])
{
Room.Chair.m();
}
}
