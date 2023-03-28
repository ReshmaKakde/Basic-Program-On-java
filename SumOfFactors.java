
import java.util.Scanner;
class SumOfFactors
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
int sum=0;
for(int i=1;i<=no;i++)
{
if(no%i==0)
sum=sum+i;
}
System.out.println("Factorial of the given no is:" +sum);
}
}