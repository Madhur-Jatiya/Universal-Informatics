class Test
{
public static void main(String arg[])
{
StringBuilder sb=new StringBuilder();

int l=sb.length();
int c=sb.capacity();
System.out.println("Value="+sb);
System.out.println("Length="+l);
System.out.println("Capacity="+c);

sb.append("Hello");

l=sb.length();
c=sb.capacity();
System.out.println("Value="+sb);
System.out.println("Length="+l);
System.out.println("Capacity="+c);


sb.append(" Allllllllll");

l=sb.length();
c=sb.capacity();
System.out.println("Value="+sb);
System.out.println("Length="+l);
System.out.println("Capacity="+c);
}
}