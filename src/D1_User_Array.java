
public class D1_User_Array extends My_Array 
{
	
	public D1_User_Array(String[] args) 
	{
		data = new int[args.length];
		for(int i = 0; i < args.length; i++)
		{
			data[i] = Integer.parseInt(args[i]);
		}
	}
}
