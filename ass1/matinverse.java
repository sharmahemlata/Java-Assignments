import java.io.*;


class matinverse
{

public static void main(String ss[]) throws IOException
{
int i,j;
int mat[][] = new int[2][2];
System.out.println("Please enter the matrix:");
for(i=0;i<2;i++)
{
	for(j=0;j<2;j++)
	{	
	mat[i][j] = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	}
}

System.out.println("Inverse of matrix:");
for(i=0;i<2;i++)
{
        for(j=0;j<2;j++)
        {
        System.out.print(mat[j][i]+"\t"); 
        }
	System.out.println();
}    

}

}
