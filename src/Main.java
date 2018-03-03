
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		if(args[0].equals("rand"))
		{
			if(args.length == 2)
			{
				//массив 1
			}
			else
			{
				My_Array a = new D2_Random_Array(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
				System.out.println(a);
				a.sort();
				System.out.println(a);
				
				
			}
		}
		else
		{
			//массив 1
		}

	}

}
