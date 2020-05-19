package ds;





public class queue 
{
	int q[];
	int front;
	int back;
	int size;

	public queue(int n)
	{
	size = n;
	front=0;
	back=0;
	q = new int[size];
	}
	 

	public boolean isfull()
	{
	if(front==size)
	{
	return true;
	}
	return false;
	}

	public boolean isempty()
	{
	if(front==back)
	{
	return true;
	}
	return false;
	}

	public void enter(int ele)
	{
	q[front]=ele;
	front++;
	}
	
	public void dequeue()
	{
	System.out.println(q[back]);
	back++;
	}
	

	public void disp()
	{
	for(int i=back;i<front;i++)
	{
	System.out.print("\t"+q[i]);
	}
	}

}
