class FirstVowel
{
public static void main(String [] args)
{
String  str="$athyaTech@25YearS!";
char[] ch=str.toCharArray();
if(ch[0]=='A'|| ch[0]=='E'||ch[0]=='I'|| ch[0]=='O'||ch[0]=='U'|| ch[0]=='a'||ch[0]=='e'|| ch[0]=='i'||ch[0]=='o'|| ch[0]=='u')
{
System.out.println("First chracatre is  Vowel");
}
else 
System.out.println("Not Vowel");
}
}