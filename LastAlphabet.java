class LastAlphabet
{
public static void main(String [] args)
{
String  str="$athyaTech@25YearS!";
char[] ch=str.toCharArray();
char ch1=ch[ch.length-1];
if((ch1>='A' && ch1<='Z') ||(ch1>='a' && ch1<='z'))
{
System.out.println("Last chracatre is  Alphabet");
}
else 
System.out.println("Not Alphabet");
}
}