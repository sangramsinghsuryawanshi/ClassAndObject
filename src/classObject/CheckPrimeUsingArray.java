package classObject;

import java.util.Scanner;

public class CheckPrimeUsingArray 
{
	public void PrimeArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("--------------------------");
		int a[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("prime array element:");
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int c=0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(n+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		CheckPrimeUsingArray c = new CheckPrimeUsingArray();
		c.PrimeArray();
		
	}

}
