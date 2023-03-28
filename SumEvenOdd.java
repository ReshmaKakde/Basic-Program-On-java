class SumEvenOdd
{
public static void main(String [] args)
{
int[] arr={5,6,4,2,9,8,7,1};
int SumEven=0;
int SumOdd=0;
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]%2==0)
SumEven++;
System.out.println(SumEven);
else
SumOdd++;
System.out.println(SumOdd);
}
}
}

