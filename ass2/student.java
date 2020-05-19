import java.io.*;



class student
{
	int roll;
	String name;
	int marks;
	static int count = 0;
	student()
	{
	count++;
	roll = count;
	}

	void accept()throws IOException
	{
	System.out.println("Enter student name");
	name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Enter marks out of 100");
	do
	{
	marks=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	if(marks<0 || marks>100)
	System.out.println("Do not enter marks out of range");
	}while(marks <0 || marks >100);
	}

	public static void main(String ss[])throws IOException
        {
        int n,i,max=0,j;
	student stud=new student();
        System.out.println("How many records do you want to enter?");
        n =Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for(i=0;i<n;i++)
        {
	System.out.println("Record "+i+1+":");	
	student s1 = new student();
	s1.accept();
	if (s1.marks>max)
	{
	stud = s1;
	}
        }
	System.out.println("Student with maximum score:\n"+stud.roll+"\t"+stud.name+"\t"+stud.marks);	
        }


}


