

public class D2_Random_Array extends My_Array {

	private int[][] data;

	public D2_Random_Array(int n, int m) 
	{
		data = new int[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				data[i][j] = 0;
			}
		}
	}

}
