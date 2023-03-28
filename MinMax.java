class MinMax
{
public static void main(String [] args)
{
int[] arr={28,36,23,11,98,62};
int max=arr[0];
int min=arr[0];
for(int i=0;i<=arr.length-1;i++)
{
for(int j=i+1;j<=arr.length-1;j++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
}
}
System.out.println("maximum element is="+max);
System.out.println("minimum element is="+min);
}
}
