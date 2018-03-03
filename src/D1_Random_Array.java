import java.util.Arrays;


public class D1_Random_Array extends My_Array 
{

	public D1_Random_Array(int n) 
	{
		data = new int[n];
		for(int i = 0; i < n; i++)
		{
			data[i] = min + rnd.nextInt(max - min + 1);
		}

	}
	

}
