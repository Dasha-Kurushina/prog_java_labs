import java.util.Arrays;
import java.util.Random;


public class My_Array 
{
	Random rnd = new Random(System.currentTimeMillis());
	int min = 10;
	int max = 100;
	int[] data;

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

