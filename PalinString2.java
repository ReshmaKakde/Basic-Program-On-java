class PalinString2
{
public static void main(String [] args)
{
String s="madam";
String s1="";
char[] ch=s.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
s1=s1+ch[i];
}
if(s.equals(s1))
System.out.println("Palindrome String");
else
System.out.println("Not Palindrome");
}
}




