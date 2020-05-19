package ds;

public class stack
{	
	char stk[];
	int top,size;

	public stack(int n)
	{
	size =  n;
	top =-1;
	stk = new char[size];
	}


	
	public boolean isempty()
	{
	if(top==-1)
	return true;
	else
	return false;
	}
	
	public void push(char ch)
	{
	top++;
	stk[top]=ch;
	}
	
	public void pop()
	{
	char ch;
	ch = stk[top];
	top--;
	System.out.print(ch);
	}
	
}
