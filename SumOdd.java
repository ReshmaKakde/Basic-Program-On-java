class SumOdd
{
public static void main(String [] args)
{
int[] arr={1,8,3,5,6,4};
int sum=0;
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]%2!=0)
{
sum=sum+arr[i];
}
}
System.out.println(sum);
}
}
