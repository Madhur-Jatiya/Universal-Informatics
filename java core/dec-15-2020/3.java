class Test
{
public static void main(String arg[])
{
StringBuffer sb=new StringBuffer();

sb.append("Hello to All");

System.out.println("Value="+sb);

sb.delete(6,9);

System.out.println("Value="+sb);
}
}


