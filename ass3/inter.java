import java.io.*;


interface  stack
{

	void push(char ch);
	char pop();
	boolean isempty();
	boolean isfull();
}




class inter implements stack
{
	 char stk[];	
	 int top;
	 int size;
	inter(int n)
	{
	size = n;
	top =-1;
	stk = new char[size];
	}

	public void push(char ch)
	{
	top++;
	stk[top] = ch;	
	}

	public char pop()
	{
	char ele;
	ele = stk[top];
	top--;
	return ele;
	}
	
	public boolean isempty()
	{
	if(top==-1)
	{
	return true;
	}
	return false;
	}

	public boolean isfull()
	{
	if(top==size)
	{
	return true;
	}
	return false;
	}

	public static void  main(String ss[])throws IOException
	{
	int i;
	char ch;
	String st;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a string");
	st = br.readLine();
	char str[] = new char[st.length()];
	inter obj = new inter(st.length());
	str = st.toCharArray(); 
	i=0;
	while(i<st.length())
	{
	obj.push(str[i]);
	i++;
	}
	i=0;
	while(i<st.length() && i>=0)
	{
	ch = obj.pop();
	if(ch==str[i])
	{
	i++;
	}
	else
	{
	System.out.println("Not a palindrome");
	System.exit(0);
	}
	}
	if(obj.isempty())
	{
	System.out.println("Palindrome");
	}
	else
	{	
	System.out.println("Not a palindrome");
	}
	}
}
