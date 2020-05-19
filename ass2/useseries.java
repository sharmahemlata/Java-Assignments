import series.prime;
import series.fibonacci;
import series.square;
import java.io.*;

class useseries
{
	public static void main(String ss[])throws IOException
	{
	int n,fib;
	prime p = new prime();
	fibonacci f = new fibonacci();
	square s = new square();
	System.out.println("Enter a number please:");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	n = Integer.parseInt(br.readLine());
	System.out.println("Fibonacci series upto "+n+"th element:");
	f.result(n);System.out.println();
	System.out.println("Squares of numbers first "+n+" numbers:");
	s.printans(n);System.out.println();
	System.out.println("Prime Numbers upto "+n+ " : ");
	p.result(n);
	}
}
