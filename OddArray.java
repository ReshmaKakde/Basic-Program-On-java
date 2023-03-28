class OddArray
{
public static void main(String [] args)
{
int[] arr={1,9,2,5,7,4};
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]%2!=0)
System.out.println(arr[i]);
}
}
}