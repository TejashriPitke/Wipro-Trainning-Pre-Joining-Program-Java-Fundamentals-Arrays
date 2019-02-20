
public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length<4)
			System.out.println("Please enter 4 integer numbers");
		else 
		{
			int a[][] = new int[2][2];
			int b[][] = new int[2][2];
			int i=0,j=0,v=1,e=1,t=0;
			for(i=0; i<2; ++i)
			{
				for(j=0; j<2; ++j)
				{
					a[i][j]=Integer.parseInt(args[2*i+j]);
				}
			}
			for(i=0; i<2; ++i)
			{
				for(j=0; j<2; ++j)
				{
					b[i][j]=Integer.parseInt(args[2*v+e]);
					t++;
					if(t==1)
						e--;
				}
				v--;
				e=1;
				t=0;
				
			}
			System.out.println("The given array is : ");
			for(i=0; i<2; ++i)
			{
				for(j=0; j<2; ++j)
				{ 
					System.out.print(a[i][j]+" ");
				}
				System.out.print("\n");
			}
			System.out.println("The reverse of the array is : ");
			for(i=0; i<2; ++i)
			{
				for(j=0; j<2; ++j)
				{ 
					System.out.print(b[i][j]+" ");
				}
				System.out.print("\n");
			}
	   
		}

	}

}

