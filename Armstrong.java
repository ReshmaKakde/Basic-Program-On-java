import java.util.Scanner;
class Armstrong
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
int sum=0;
int r=0;
int temp=no;
while(no>0)
{
r=no%10;
sum=sum+r*r*r;
no=no/10;
}
if(temp==sum)
System.out.println("the given number is Armstrong number");
else
System.out.println("the given number is not armstrong number");
}
}
