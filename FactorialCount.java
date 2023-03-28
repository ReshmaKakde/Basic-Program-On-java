
import java.util.Scanner;
class FactorialCount
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
int count=0;
for(int i=1;i<=no;i++)
{
if(no%i==0)
count++;

}
System.out.println("Factorial Count of the given no is:" +count);
}
}