import java.io.*;

class zeroarraysize extends Exception
{
	zeroarraysize(String s)
	{
	System.out.println(s);
	}


}



class numarray
{
	public static void main(String ss[])throws IOException
	{	
	int n,i;
	float avg=0;
	float arr[] = new float[5];
	System.out.println("How many numbers do you want to enter?");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try
	{
	n = Integer.parseInt(br.readLine());
	if(n==0)
		throw new zeroarraysize("You cannot enter zero numbers");
	if(n>5)
		throw new ArrayIndexOutOfBoundsException("Maximum 5 numbers can be entered");
	System.out.println("Enter the numbers please:");
	for(i=0;i<n;i++)
	{
	arr[i] = Float.parseFloat(br.readLine());
	}
	for(i=0;i<n;i++)
	{
	avg+=arr[i];
	}
	avg = avg/n;
	System.out.println("Average:"+avg);
	}
	catch(NumberFormatException e)
	{
	System.out.println("Invalid Input");
	}
	catch(NegativeArraySizeException e)
	{
	System.out.println("Please do not enter negative array size");
	}
	catch (zeroarraysize e)
	{
	System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(e);
	}
	}


}
