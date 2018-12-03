package ptpkg;

public class CucumberLet 
{
	public static int cucumber(int[] a)
	{
		int pear = 0;
		int i = 0;
		while(i < a.length) 
		{
			pear = pear + a[i];
			i++;
		}
		return pear;
	}
	
	public static int lettuce(int[] a, int p)
	{
		int i = 0;
		int berry = 0;
		while(i < a.length)
		{
			if(a[i] == p)
			{
				berry++;
			}
			i++;
		}
		return berry;
	}
	
	public static int tomato(int[] a, int p)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == p)
				return i;
		}
		return -1;
	}
}
