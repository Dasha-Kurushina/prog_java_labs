import java.util.Arrays;


public class D1_Random_Array extends My_Array 
{
	int[] data;

	public D1_Random_Array(int n) 
	{
		data = new int[n];
		for(int i = 0; i < n; i++)
		{
			data[i] = min + rnd.nextInt(max - min + 1);
		}

	}
	
	public String toString()
	{
		String out = "";
		String comma = ", ";
		
		for(int i = 0; i < data.length; i++)
		{
			out += String.valueOf(data[i]) + comma;
		}
		return out;
	}

	public void sort()
	{
		Arrays.sort(data);
	}

}
