public class Swap2
{
public static void main(String [] args)
{
int a=30;
int b=40;

a=a+b;
b=a-b;
a=a-b;

System.out.println("After the swapping the value of a and b is ");
System.out.println("a="+a);
System.out.println("b="+b);
}
}
