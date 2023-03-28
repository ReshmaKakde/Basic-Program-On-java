import java.util.Scanner;
class SumOfFirstLast
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Num:");
int n=sc.nextInt();
int first=n%10;
n=n/10;
while(n>=10)
{
n=n/10;
}
int last=n%10;
System.out.println("Sum of first and last Digit:"+(first+last));
}
}
