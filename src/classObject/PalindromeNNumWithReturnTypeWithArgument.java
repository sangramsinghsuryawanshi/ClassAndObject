package classObject;

import java.util.Scanner;

public class PalindromeNNumWithReturnTypeWithArgument 
{
	public int[] palindromeArayy(int first,int last)
	{
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		for(int i=first;i<=last;i++)
		{
			int rev=0,rem=0;
			int j=i;
			for(;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
			{
				cnt++;
			}
		}
		int c[]=new int[cnt];
		int ind=0;
		for(int i=first;i<=last;i++)
		{
			int rev=0,rem=0;
			int j=i;
			for(;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
			{
				c[ind++]=i;
			}
		}
		return c;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PalindromeNNumWithReturnTypeWithArgument p = new PalindromeNNumWithReturnTypeWithArgument();
		int first=1,last=1000;
		int b[]=p.palindromeArayy(first,last);
		System.out.println("Enter array element: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}
