import java.util.Random;



public class D2_Random_Array extends My_Array 
{
	Random rnd = new Random(System.currentTimeMillis());
	int min = 10;
	int max = 100;
	
	private int[][] data;

	public D2_Random_Array(int n, int m) 
	{
		data = new int[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				data[i][j] = min + rnd.nextInt(max - min + 1);
			}
		}
	}
	
	public String toString()
	{
		String out = "";
		String comma = ", ";
		String endl = "\n";
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				out += String.valueOf(data[i][j]) + comma;
			}
			out += endl;
		}
		return out;
	}

}
