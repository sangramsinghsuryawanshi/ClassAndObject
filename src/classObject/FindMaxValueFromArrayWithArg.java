package classObject;

import java.util.Scanner;

public class FindMaxValueFromArrayWithArg 
{
	public void MaxValueWithArgInArray(int []a)
	{
		System.out.print("Maximum value of given array is: ");
		int max=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print(max);
		System.out.println("\n-----------------------");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindMaxValueFromArrayWithArg f = new FindMaxValueFromArrayWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("-----------------------");
		int a[] = new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------");
		f.MaxValueWithArgInArray(a);
	}

}
