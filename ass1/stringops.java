import java.io.*;

class stringops
{
	public static void main(String ss[])throws IOException
	{
	int i,len,choice;
	String input;	
	System.out.println("Enter a string please:");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	input = br.readLine();
	len = input.length();
	char str[] = new char[len];
	str = input.toCharArray();

	do
	{
	System.out.println("1)Print length of string.\n2)Print reverse.\n3)Print alternate character of string.\n0)Exit");
	choice = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	switch(choice)
	{
	case 0:
		System.exit(0);
		break;
	case 1:
		System.out.println(len);
		break;

	case 2:
		for(i=len-1;i>=0;i--)
		{		
		System.out.print(str[i]);
		}
		System.out.println();
		break;
	case 3:
		i=0;
		do
		{
		System.out.print(str[i]);
		i+=2;
		}
		while(i<len);
		System.out.println();
		break;

	default:
		System.out.println("Please Enter valid input.");
	}
	}while(choice!=0);
	}

}
