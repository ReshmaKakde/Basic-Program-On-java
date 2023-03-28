import java.util.Scanner;
class HighestNumber
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
int r;
int large=0;
while(no>0)
{
r=no%10;
if(r>large)
{
large=r;
}
no=no/10;
}
System.out.println("Large Digit is :"+large);
}
}

