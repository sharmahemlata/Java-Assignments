import ds.stack;
import ds.queue;
import java.io.*;


class datastruct
{	
	static void reverse()throws IOException
	{
	int i,len;
	String st;
	System.out.println("Enter a string:");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	st = br.readLine();
	len = st.length();
	char str[] = new char[len];
	stack s = new stack(len);
	str = st.toCharArray();
	i=0;
	while(i!=len)
	{
	s.push(str[i]);
	i=i+1;
	}
	System.out.print("Reverse:");
	i=0;
	while(i!=len)
	{
	s.pop();
	i++;
	}
	}
	

	static void queue()throws IOException
	{
	int choice,size;
	System.out.println("Please enter size of the queue:");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	size = Integer.parseInt(br.readLine());
	queue q = new queue(size);
	do{
	System.out.println("\n1)Enter elements.\n2)Remove elements.\n3)Display queue.\n0)Exit");
	choice = Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 0:	System.exit(0);
		break;
	case 1: if(!q.isfull())
		{
		System.out.println("Enter element:");
		q.enter(Integer.parseInt(br.readLine()));
		}
		else
		{
		System.out.println("Queue is full");
		}
		break;
	case 2: if(q.isempty())
		{
		System.out.println("Queue is empty");
		}
		else
		{
		q.dequeue();
		}
		break;
	case 3: if(q.isempty())
		{
		System.out.println("Queue is empty");
		}
		else
		{
		q.disp();
		}
		break;
	default:	
		System.out.println("Invalid choice");
	}
	}
	while(choice!=0);	
	}

	public static  void main(String ss[])throws IOException
	{
	int choice,i,len;
	String st;	
	char ch;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do
	{
	System.out.println("\n1)Print reverse of a string using stack.\n2)Implement queue operations.\n0)Exit");
	choice = Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 0:
		System.exit(0);
		break;
	case 1: reverse();
		break;
	case 2:queue();
		break;
	default:
		System.out.println("Invalid Input");
	}
	}while(choice!=0);
	}

}
