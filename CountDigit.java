
import java.util.Scanner;
class SumDigit
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();java
int sum=0;
while(no>0)
{
sum=sum+no%10;
no=no/10;;
}
System.out.println("Digit count is:"+sum);

}
}
