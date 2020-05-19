package series;

public class fibonacci
{
        public void result(int n)
        {
	int i;
        int arr[] = new int[n+1];
	arr[1]=1;arr[2]=1;
	for(i=3;i<=n;i++)
	{	
	arr[i]=arr[i-1]+arr[i-2];
	}
	for(i=1;i<=n;i++)
	{
	System.out.print("\t"+arr[i]);
	}
        }
}

