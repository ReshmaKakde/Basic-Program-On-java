class BinarySearch
{
 binarySearch(int[]a,int first,int last,int target)
{
int[] a={3,5,7,11,15,17,19,21,23};
int target=19;

int mid=(first+last)/2;
while(first<=last)
{
if(target>a[mid])
{
first=mid+1;
}

else if(target==a[mid]);
{
System.out.println("Element fount at index"+a[mid]);
break;
}
else
{
last=mid-1;
}
mid=(first+last)/2;
}
}
class Test
{
public static void main(String [] args)
{
}
}
