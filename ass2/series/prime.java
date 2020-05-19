package series;



public class prime
{


	public void result(int n)
	{
	int i,j,check=0;
	for(i=1;i<=n;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
			check=0;
			break;
			}
			else
			{
			check=1;
			}
		}
			if(check==1|| i==1 || i==2)
			{
			System.out.println(i);
			}	
		}
	}

}


