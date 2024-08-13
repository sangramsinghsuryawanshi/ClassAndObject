package classObject;

public class FibonaciNoReturnTypeWithArg 
{

	public void fibonaciNum(int a,int b)
	{
		int n=10;
		System.out.print("Fibonaci number is: ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) 
	{
		FibonaciNoReturnTypeWithArg f = new FibonaciNoReturnTypeWithArg ();
		f.fibonaciNum(0, 1);

	}

}
