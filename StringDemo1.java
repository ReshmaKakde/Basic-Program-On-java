public class StringDemo1
{
public static void main(String [] args)
{
String s1="Sathya";
String s2="Sathya";
System.out.println(s1==s2);           // true
String s3=new String("Sathya");
System.out.println(s3==s1);           //  false
System.out.println(s3.equals(s1));    // True

}
}
