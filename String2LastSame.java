// program to check 2 string  last characters is same or not//
class String2LastSame
{
public static void main(String [] args)
{
String s1="Sathya";
String s2="$athya";
char[] ch1 =s1.toCharArray();
char[] ch2=s2.toCharArray();
if((ch1[ch1.length-1])==(ch2[ch2.length-1]))
{
System.out.println("Same");
}
else
System.out.println("Not Same");
}
}












