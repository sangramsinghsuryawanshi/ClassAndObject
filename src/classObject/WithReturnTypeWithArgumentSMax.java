package classObject;

import java.util.Scanner;

public class WithReturnTypeWithArgumentSMax 
{
	public int secondMax(int arr[])
	{
		int max=0,smax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && smax!=max)
			{
				smax=arr[i];
			}
		}
		System.out.println("\nSecond max array element is: "+smax);
		return smax;
	}
	public int secondMin(int arr[])
	{
		int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin && smin!=min)
			{
				smin=arr[i];
			}
		}
		System.out.print("Second min array element is: "+smin);
		return smin;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WithReturnTypeWithArgumentSMax w2 = new WithReturnTypeWithArgumentSMax();
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		w2.secondMax(a);
		w2.secondMin(a);
		
	}

}
