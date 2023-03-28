class SwapArray
{
public static void main(String [] args)
{
int[] arr={1,6,8,9,2,4,6,5};
int a=arr[0];
int temp=0;
int b=arr[arr.length-1];
for(int i=0;i<=arr.length-1;i++)
{
temp=a;
a=b;
b=temp;
System.out.Println(a);
System.out.Println(b);
}
}
}