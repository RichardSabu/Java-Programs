import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		int arr[]=new int[50];
		int n,i,j,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements of array:");
		n=scan.nextInt();
		System.out.println("Enter elements of array:");
		for (i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for (i=0;i<n-1;i++)
		{
			for (j=0;j<n-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for (i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
