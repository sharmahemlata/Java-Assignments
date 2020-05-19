import java.io.*;



class operations
{
	public static void main(String s[])throws IOException
	{
	int len;
	if(s.length!=1)
	{
	System.out.println("Inavalid number of arguments");
	System.exit(0);
	}
	else
	{
	File f1 =  new File(s[0]);
	if(f1.isFile())
	{
	System.out.println(s[0]+" is a file.");
	System.out.println("Size: "+f1.length()+" bytes");
	System.out.println("Path: "+f1.getAbsolutePath());
	System.out.println("Last modified: " +f1.lastModified());
	}
	if(f1.isDirectory())
	{
	  System.out.println(s[0]+" is a directory.");
	  String ss[] = f1.list();
	  if(s.length!=0)
	  {		
	  System.out.println("Contents of this directory:");
	  String list[] = f1.list();
	  for(String l:ss)
		{
		System.out.print("\t"+ l +"\t");		
		}
          for(String str:ss)
		{
		if(str.endsWith(".txt"))
		{
		System.out.println("\nShould "+str+ " be deleted?Y/N");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
		String response  = br.readLine();		
		if(response.equals("Y") || response.equals("y"))
		{
		File temp =  new File(f1,str);
		temp.delete();
		System.out.println("Deleted "+str+".");
		break;
		}
		else if(response.equals("n") || response.equals("N"))
		{
		System.out.println("Skipping "+ str +".");
		break;
		}
		else
		{
		System.out.println("Invalid response.Please enter only Y/N");
		}
		}
		}	

		}	
	  }		
	}

	
	}
	}
}
