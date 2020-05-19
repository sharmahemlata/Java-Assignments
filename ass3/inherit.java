import java.io.*;


class person

{	
	static int count = 0;
	protected int p_no; 
	protected String name;
	protected String address;
	
	person(String n ,String addr)
	{
	count++;
	p_no = count;
	name = n;
	address = addr;
	}
	
}




class student extends person
{
	static int count = 0;
	String subjects[];
	float cgpa[];
	int roll_no,sub_count;
	
	void accept(int n) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i=0;
	while(i!=n)
	{
	System.out.println("Enter subject name "+(i+1)+" :");
	subjects[i] = br.readLine();
	do
	{
	System.out.println("CGPA for "+subjects[i]+ " : ");
	cgpa[i] = Float.parseFloat(br.readLine());
	if(cgpa[i]<0 || cgpa[i]>10)
	System.out.println("CGPA:0-10.");
	}
	while(cgpa[i]<0 || cgpa[i]>10);
	i++;
	}
	}
	
	student(int sub_no,String name,String addr) throws IOException
	{
	super(name,addr);
	count++;
	roll_no = count;
	sub_count = sub_no;
	subjects = new String[sub_no];
	cgpa = new float[sub_no];
	accept(sub_no);
	}

	void disp()
	{
	int i=0;
	System.out.println("Student Name:"+name);
	System.out.println("Subjects and CGPA obtained:");
	while(i<sub_count)
	{
	System.out.println("\t"+subjects[i]+"\t"+cgpa[i]);
	i++;
	}
	}
	
}




class teacher extends person
{
	static int count = 0;
	String 	subjects[];
	int sub_count = 0;
	int sr_no;
	
	void accept(int n)throws IOException
	{
	int i=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(i!=n)
	{
	System.out.println("Enter subject " + (i+1)+ ":");
	subjects[i] = br.readLine();
	i++;
	sub_count++;
	}
	}
	
	teacher(int sub_no,String name,String addr)throws IOException
	{
	super(name,addr);
	count++;
	subjects = new String[20];
	sr_no = count;
	accept(sub_no);
	}
	
	void disp()
	{
	int i=0;
	System.out.println("\nName:"+name);
	System.out.println("Subjects taught:");
	while(i<sub_count)
	{
	if(subjects[i]!=null)
	{
	System.out.print(subjects[i]+"\t");
	}
	i++;
	}
	}
	
	void addSubject(String sub_name)
	{
	int i=0;
	boolean already = false;
	while(i<sub_count)
	{
	if(sub_name.equals(subjects[i]))
	{
	System.out.println("This subject already exits");
	already = true;
	break;
	}
	i++;
	}
	if(!already)
	{
	subjects[sub_count] = sub_name;
	sub_count++;
	}
	}
	
	int removeSubject()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i=0,temp;
	int sub_index,j;
	while(i<sub_count)
        {
        if(subjects[i]!=null)
        {
        System.out.print((i+1)+")"+subjects[i]+"\t");
        }
        i++;
        }
	do
	{
	System.out.println("\nEnter Subject no to be deleted:");
	j = Integer.parseInt(br.readLine());
	if(j<1 || j>sub_count)
	{
	System.out.println("Enter valid subject no");
	}
	}while(j<1 || j>sub_count);
	sub_index = j-1;
	while(sub_index<sub_count)
	{
	subjects[sub_index] = subjects[sub_index+1];
	sub_index++;
	}
	subjects[sub_index]=null;
	sub_count--;	
	return 1;
	}

}


class inherit
{




	static void modifyteacher(int count,teacher t[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int j,record_id,choice;
		int res;
		if(count!=0)
        	{
                j=0;
                while(j<count)
                {
		System.out.print(t[j].sr_no);	
                t[j].disp();
                j++;
                }
		do
		{
		System.out.println("\nEnter record no  to be modified");
		record_id = Integer.parseInt(br.readLine());
		if(record_id<1 || record_id>count)
		{
		System.out.println("Please enter valid record no");
		}
		}
		while(record_id<1 || record_id>count);
		System.out.println("\t"+t[record_id-1].name +"\t"+t[record_id-1].address);
		do
		{
		System.out.println("\n1)Add a subject.\n2)Remove existing subject.\n0)Exit.");
		choice = Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1: 
			System.out.println("Enter subject name to be added:");	
			t[record_id-1].addSubject(br.readLine());
			break;
		case 2:
			res = t[record_id-1].removeSubject();
			if(res==1)
			{
			System.out.println("Removed subject successfully");
			t[record_id-1].disp();
			}
			else
			{
			System.out.println("Could not remove subject");
			}
			break;
		default:	
			System.out.println("Invalid input");	
		}
		}
		while(choice!=0);
                }
                else
                {
                System.out.println("No teacher records");
                }


	}		



	public static void main(String ss[])throws IOException
	{
	int choice,j;
	int stud_count=0;
	int teach_count=0;
	int sub_no;
	String name,addr;
	student s[] = new student[20];
	teacher t[] = new teacher[20];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do
	{
	System.out.println("\n1)Add a student.\n2)Add a teacher.\n3)Display all students.\n4)Display all teachers.\n5)Modify a teacher.\n0Exit.");
	choice = Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 0:
		System.exit(0);
		break;
	case 1:
		System.out.println("Enter Student name:");
		name = br.readLine();
		System.out.println("Enter student addr:");
		addr = br.readLine();
		System.out.println("Enter no_of courses taken by "+name+";");
		sub_no = Integer.parseInt(br.readLine());
		s[stud_count]= new student(sub_no,name,addr);
		stud_count++;
		break;
	case 2:
		System.out.println("Enter Teacher name:");
                name = br.readLine();
                System.out.println("Enter Teacher  addr:");
                addr = br.readLine();
                System.out.println("Enter no_of courses taught by "+name+";");
                sub_no = Integer.parseInt(br.readLine());
                t[teach_count]= new teacher(sub_no,name,addr);
		teach_count++;
		break;
	case 3: 
		if(stud_count!=0)
		{
		j=0;
		while(j<stud_count)
		{
		s[j].disp();
		j++;
		}
		}
		else
		{
		System.out.println("No student records");
		}
		break;
	case 4: if(teach_count!=0)
		{	
		j=0;
                while(j<teach_count)
                {
                t[j].disp();
                j++;
                }
		}
		else
		{
		System.out.println("No teacher records");
		}
		break;
	case 5: modifyteacher(teach_count,t);
		break;
	default:
		System.out.println("Invalid choice");
	}
	}
	while(choice!=0);
	}
}


