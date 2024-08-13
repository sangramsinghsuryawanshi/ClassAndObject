package classObject;

public class NoReturnTypeWithArg 
{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.print("Addition two number: "+c+"\n");
	}

	public static void main(String[] args) 
	{
		NoReturnTypeWithArg n = new NoReturnTypeWithArg ();
		int a=70,b=2;
		n.add(4, 3);
		n.add(a, b);
	}

}
