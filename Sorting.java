class Sorting
{
public static void main(String [] args)
{

int temp=0;
int[] arr={1,9,7,4,6,3,2};
for(int i=0;i<=arr.length-1;i++)
{
for(int j=i+1;j<=arr.length-1;j++)
{
if(arr[i]>arr[j])
{

temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.println(arr[i]);
}
}
}
