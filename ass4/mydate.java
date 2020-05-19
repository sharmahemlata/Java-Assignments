import java.io.*;


class invaliddateexception extends Exception
{
	invaliddateexception(String s)
	{
	super(s);
	}
}

class mydate
{


	public static void main(String ss[])throws IOException
	{
	int d,m,y;
	boolean dateisvalid = true;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter date(dd/mm/yyy):");
	System.out.println("Date(dd)");
	d = Integer.parseInt(br.readLine());
	System.out.println("Month:");
        m = Integer.parseInt(br.readLine());
	System.out.println("Year");
        y = Integer.parseInt(br.readLine());
	try
	{
	if(m<1 || m>12)
	{
	throw new invaliddateexception("Invalid month");
	}
	else if(y<1)
	{
	throw new invaliddateexception("Invalid year");
	}
	else
	{
	if(m==4 || m==6 || m==9 || m==11)
	{	
	if(d<1 || d>30)
	{
	throw new invaliddateexception("This month can have only 30 days");
	}
	}
	else if(m==1 || m==3 || m==5 || m==7 || m==8 ||m==10 || m==12)
	{
	if(d<1 || d>31)
	{
	throw new invaliddateexception("This month has only 31 days");
	}
	}
	else
	{
	if(y%4!=0)
	{
	if(d<1 || d>28)
	{
	throw new invaliddateexception("feb has 28 days when year is not a leap year");
	}	
	}
	else
	{
	if(d<1 ||  d>29)
	{
	throw new invaliddateexception("days out of range for feb");
	}
	}
	}
	}
	}
	catch(invaliddateexception e)
	{
	dateisvalid = false;
	System.out.println(e);
	}
	finally
	{
	if(dateisvalid)
	{
	System.out.println("Date is valid");
	}
	}	
	}


}


