package classObject;

import java.util.Scanner;

public class PalindromeWithReturnTypeWithArgument 
{
	public int[] palindromeArayy(int[]a)
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			int rev=0,rem=0;
			int j=a[i];
			for(;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(rev==a[i])
			{
				cnt++;
			}
		}
		int c[]=new int[cnt];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			int rev=0,rem=0;
			int j=a[i];
			for(;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(rev==a[i])
			{
				c[ind++]=a[i];
			}
		}
		return c;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PalindromeWithReturnTypeWithArgument p = new PalindromeWithReturnTypeWithArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=p.palindromeArayy(a);
		System.out.println("Enter array element: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}
