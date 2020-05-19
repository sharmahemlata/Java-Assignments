import java.io.*;


class two
{



public static void main(String args[])throws IOException
{	
	String search,filename,str;
	RandomAccessFile  fr;
	File fp;
	BufferedReader br;
	int count=0;
	if(args.length<2)
	{
	System.out.println("Invalid no. of arguments" + args.length);
	System.exit(1);
	}


	if(args.length==2)
	{
	search = args[0];
	fp = new File(args[1]);
	if(fp.isFile())
	{
	fr = new RandomAccessFile(args[1],"r");
	System.out.println("Lines containing the specified string:");
	while(true)
	{
	str = fr.readLine();
	if(str!=null)
	{
	if(str.contains(search))
	{
	System.out.println(str);
	}
	}
	else
	{
	break;
	}
	}
	}
	else
	{
	System.out.println("You have not entered valid file option");
	}
	}


	if(args.length == 3 && args[0].equals("-c"))
	{
	search = args[1];
        fp = new File(args[2]);
        if(fp.isFile())
        {
        fr = new RandomAccessFile(args[2],"r");
        while(true)
        {
	str = fr.readLine();
	if(str!=null)
	{
	if(str.contains(search))
	{
        count++;
	}
	}
	else
	{
	break;
	}
        }
	System.out.println("Number of lines in this program containing "+search+":"+count);
        }
        else
        {
        System.out.println("You have not entered valid file option");
        }
	}


	if(args.length ==3 && args[0].equals("-v"))
	{
	search = args[1];
        fp = new File(args[2]);
        if(fp.isFile())
        {
        fr = new RandomAccessFile(args[2],"r");
        while(true)
        {
	str = fr.readLine();
	if(str!=null)
	{
	if(!str.contains(search))
        {
        count++;
        }
        }
	else
	{
	break;
	}
	}
        System.out.println("Number of lines in this program that do not contain "+search+":"+count);
        }
	else
	{
	System.out.println("Entered wrong file option");
	}
        }
        
	}

}


