
import java.util.Scanner;
class ReverseNo
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
while(no>0)
{
System.out.println(no%10);
no=no/10;
}
}
}