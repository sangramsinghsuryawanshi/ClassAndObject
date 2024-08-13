package classObject;

import java.util.Scanner;


public class PrimeWithReturnTypeWithArgumentSMax 
{
	public int[] primeNum(int arr[])
	{
		int c=0,cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			c=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				cnt++;
			}
		}
		int p[]= new int[cnt];
		int ind=0;
		for(int i=0;i<arr.length;i++)
		{
			c=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				p[ind++]=arr[i];
			}
		}
		return p;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrimeWithReturnTypeWithArgumentSMax p1 = new PrimeWithReturnTypeWithArgumentSMax();
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter array element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Given prime array element is: ");
		int b[]=p1.primeNum(arr);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
