
import java.util.Scanner;
class LeapYear
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int y=sc.nextInt();
if((y%100!=0&& y%4==0)||(y%100==0&& y%400==0))
{
System.out.println("Year is leap year");
}
else

System.out.println("Not leap year");
}
}
