class Raj
{
Raj()
{
System.out.println("Raj kapoor");
}
}

class Rishi extends Raj
{
Rishi()
{
System.out.println("Rishi kapoor");
}
}

class Ranveer extends Rishi
{
Ranveer()
{
System.out.println("Ranveer kapoor");
}
}

class Test
{
public static void main(String arg[])
{
Ranveer r=new Ranveer();
}
}