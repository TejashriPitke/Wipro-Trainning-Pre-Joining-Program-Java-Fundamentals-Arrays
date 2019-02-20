

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k= Integer.parseInt(args[0]);
		int flag=0,v=0;
		int arr[]= {1,4,34,56,7};
		for(int i=0;i<5;i++)
		{
			if(k==arr[i])
			{
				flag=1;
				v=i;
				
			}
		}
		if(flag==1)
			System.out.println(v+1);
		else
			System.out.println("-1");

	}

}
