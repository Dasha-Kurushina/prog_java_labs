
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		My_Array a = null;
		
		if(args[0].equals("rand"))
		{
			if(args.length == 2)
			{
				a = new D1_Random_Array(Integer.parseInt(args[1]));
			}
			else
			{
				a = new D2_Random_Array(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
			}
		}
		else
		{
			//массив 1
		}
		System.out.println(a);
		a.sort();
		System.out.println(a);
	}
	
	

}
