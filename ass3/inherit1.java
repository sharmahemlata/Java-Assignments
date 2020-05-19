import java.io.*;



interface  shape
{
		
	abstract void accept(float num);	
	abstract void display();
	abstract void getarea();
	
}


class circle implements shape
{
	String name;
        int edges;
        int vertices;
        float x;
        double area;

	circle()
	{
	name = "Circle";
	edges = 0;
	vertices = 0;
	}
	
	public void accept(float num)
	{
	x = num;
	area = 3.147*x*x;
	}
	
	public void getarea()
	{	
	System.out.println("Area:"+area);
	}
	
	public void display()
	{
	System.out.println("\nShape:"+name+"\tRadius:"+x+"\tArea:"+area);
	}

}


class square implements shape
{
	String name;
        int edges;
        int vertices;
        float x;
        double area;

	square()
	{	
	name = "Square";
	edges = 4;
	vertices = 4;
	}

	public void accept(float num)
	{
	x = num;
	area = x*x;
	}
	
	public void getarea()
	{
	System.out.println("Area:"+area);
	}
	
	public void display()
	{
	System.out.println("\nShape:"+name+"\tlength:"+x+"\tArea:"+area +"\tEdges:"+edges+"\tVertices"+vertices);
	}
}




class inherit1
{
	public static void main(String ss[])throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int choice;
	do	
	{
	System.out.println("\n1)Circle.\n2)Square.\n0)Exit.");
	choice = Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 0:	
		System.exit(0);
		break;
	case 1: 
	       circle c = new circle();
	       System.out.println("Enter radius of the circle");
	       c.accept(Float.parseFloat(br.readLine()));
	       c.display();					
	       break;
        case 2:
		square s= new square();
		System.out.println("Enter length of side");
		s.accept(Float.parseFloat(br.readLine()));
		s.display();
		break;
 	default:	
		System.out.println("Invalid choice");
	}
	}
	while(choice!=0);	
	}

}
