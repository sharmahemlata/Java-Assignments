import java.io.*;

class three
{

	public static void main(String ss[])throws IOException
	{
	int choice,found=0;
	float max=-1,total = 0;
	String str,search,book;
	RandomAccessFile raf = new RandomAccessFile("book.dat","rw");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\tReading from file book.dat");
	do
	{
	System.out.println("1)Search for a book by name.\n2)Find the costliest book.\n3)Display all book and their total cost.\n0)Exit");
	choice = Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 0:
		System.exit(1);
		break;
	case 1:
		raf.seek(0);
		found=0;
		System.out.println("Enter the name of the book:");
		search = br.readLine();
		while((str=raf.readLine())!=null)
		{
		String arr[] = str.split(" ");
		if(arr[1].equals(search))
		{
		found = 1;
		System.out.println("Book Found:\n"+str);
		break;
		}
		}
		if(found==0)
		{
		System.out.println("This book does not exist in our database");
		}	
		break;
	case 2: 
		raf.seek(0);
		book = null;
		while((str=raf.readLine())!=null)
                {
                String arr[] = str.split(" ");
                if(Float.parseFloat(arr[2])>max)
                {
                max = Float.parseFloat(arr[2]);
		book = str;
                }
                }
		System.out.println("Costliest book: "+book);	
		break;

	case 3:
		raf.seek(0);
		System.out.println("\tId\tName\tPrice\t    Quantity\t    Total Cost");
		while((str=raf.readLine())!=null)
                {
                String arr[] = str.split(" ");
		total = Float.parseFloat(arr[2])*Float.parseFloat(arr[3]);
		System.out.println("\t"+arr[0]+"\t"+arr[1]+"\t"+arr[2]+"\t\t"+arr[3]+"\t\t"+total);
                }
		break;
	default:
		System.out.println("Invalid choice");
	}	
	}while(choice!=0);
	}

}
