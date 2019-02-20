
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length<9)
			System.out.println("Please enter 4 integer numbers");
		else 
		{
			int a[][] = new int[3][3];
			int i=0,j=0,max=0;
			for(i=0; i<3; ++i)
			{
				for(j=0; j<3; ++j)
				{
					a[i][j]=Integer.parseInt(args[3*i+j]);
					if(a[i][j]>max)
						max=a[i][j];
				}
			}
			System.out.println("The biggest number in the given array is " + max);

	}

}
}
