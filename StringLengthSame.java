// program to chech 2 string having a same length or not//
class StringLengthSame
{
public static void main(String [] args)
{
String s1="Sathya";
String s2="$athya";
char[] ch1=s1.toCharArray();
char[] ch2=s2.toCharArray();
int count1 =0,count2=0;
for(int i=0;i<ch1.length-1;i++)
{
count1++;
}
for(int j=0;j<ch2.length-1;j++)
{
count2++;
}
if(count1==count2)
System.out.println("Same Length");
else
System.out.println("Not same");
}
}