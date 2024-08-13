package classObject;

import java.util.Scanner;

public class PrimeNumAccesesTheArrayByTheArg 
{
	public void PrimeNoReturnTypeWithArg(int[] a)
	{
		System.out.print("Prime Number no ReturnType With Argument ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrimeNumAccesesTheArrayByTheArg p = new PrimeNumAccesesTheArrayByTheArg();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("------------------------\n");
		System.out.print("Enter size of array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		p.PrimeNoReturnTypeWithArg(a);
	}

}
