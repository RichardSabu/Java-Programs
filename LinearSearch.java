import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		int arr[]=new int[50];
		int n,i,e,c=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements of array:");
		n=scan.nextInt();
		System.out.println("Enter elements of array:");
		for (i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter element to be searched;");
		e=scan.nextInt();
		for (i=0;i<n;i++)
		{
			if (arr[i]==e)
			{
				System.out.println("Element is found at index "+i);
				c=0;
			}
		}
		if (c!=0)
		{
			System.out.println("Element is not found");
		}
	}
}
