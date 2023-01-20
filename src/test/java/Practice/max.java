package Practice;

public class max {

	public static void main(String[] args) 
	{
int arr[]= {2,3,2,63,42,7};
int largest=arr[0];
for(int i=0;i<=arr.length-1;i++)
{
	if(largest<arr[i])
	{
		largest=arr[i];
	}
}
System.out.println(largest);
	}

}
