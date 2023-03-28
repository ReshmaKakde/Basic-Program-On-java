class Test
{
static void m1()
{
System.out.println("Welcome to java");
}
static int m2()
{
int result1=2+3+4-5-7/6+5%2;
return result1;
}
static int m3()
{ 
int result2=2+3*5-8/2+9%2;
return result2;
}
int m4()
{
int a=m2()+m3();
return a;
}
static String m5()
{
String s1="Sathya";
String s2="10";
return s1+s2;
}
static double m8(int a){
double sum=a+2.3;
return sum;
}

public static void main(String [] args)
{
Test.m1();
int y=Test.m2();
System.out.println(y);
int z=Test.m3();
System.out.println(z);
Test t1=new Test();
int x=t1.m4();
System.out.println(x);
String s8=Test.m5();
System.out.println(s8);
double d=Test.m8(4);
System.out.println(d);
}
}

