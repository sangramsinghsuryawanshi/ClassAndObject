package classObject;

import java.util.Scanner;

public class PrimeNNumSeriesWithArgAndReturnType 
{
	public int[] primeNNum(int n,int n1)
	{
		int c=0,cnt=0;
		for(int i=n;i<=n1;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
				
			}
			if(c==2)
			{
				cnt++;
			}
		}
		//System.out.println("c : "+cnt);
		int  b[]=new int[cnt];
		int ind=0;
		for(int i=n;i<=n1;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
				
			}
			if(c==2)
			{
				b[ind++]=i;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrimeNNumSeriesWithArgAndReturnType p = new PrimeNNumSeriesWithArgAndReturnType();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number and second number :");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.println("Given prime series is: ");
		int b[]=p.primeNNum(n, n1);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
				
	}

}
