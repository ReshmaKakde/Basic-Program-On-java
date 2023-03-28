class LengthEvenorNot
{
public static void main(String [] args)
{
String str="$@thyaTecH@25YearS!";
char[] ch=str.toCharArray();
int count=0;
for(int i=0;i<=ch.length-1;i++)
{
count++;
}
if(count%2==0)
System.out.println("The length of String is even");
else
System.out.println("The length of String is not even");
}
}



