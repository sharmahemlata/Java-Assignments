import java.io.*;



class invalidemail extends Exception
{
	invalidemail(String s)
	{
	super(s);
	}
}



class email 
{
	
	public static void main(String ss[]) throws IOException
	{
	String email;
	char f;
	int at,lt;
	boolean isvalid = true;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter email address:");
	email = br.readLine();
	f = email.charAt(0);
	at = email.indexOf('@');
	lt = email.lastIndexOf('@');
	try
	{
	if(Character.isDigit(f))
	{
	throw new invalidemail("Email cannot start with a number");
	}
	if(at<0 || (at!=lt))
	{
	throw new invalidemail("Email should have one '@'");
	}
	String s[] = email.split("@");
	if(s.length<2)
	{
	throw new invalidemail("Email should have domain after @");
	}
	if(s[1].contains("."));
	{
	throw new invalidemail("Email should have atleast one '.' in domain name");
	}
	}
	catch(invalidemail e)
	{
	isvalid = false;
	System.out.println(e);
	}
	finally
	{
	if(isvalid)
	{
	System.out.println("Valid email address");
	}
	}
	}
}
