class ReverseString
{
public static void main(String [] args)
{
String str="Poonam";
String str2="Khadgi";
String rev=" ";
String rev2=" ";
int len=str.length();
int len2=str2.length();
for(int i=len-1;i>=0;i--)
{
for( i=len2-1;i>=0;i--)
{
rev=rev+str.charAt(i);s
rev2=rev2+str2.charAt(i);
}
}
System.out.print(rev);
System.out.println(rev2);

}
}


