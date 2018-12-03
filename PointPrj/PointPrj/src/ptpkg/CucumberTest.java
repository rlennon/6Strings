package ptpkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class CucumberTest 
{
	private int[] m;

	@Test
	public void testCucumber() 
	{
		int[] m = new int[5];
		for (int i = 0; i < m.length; i++)
		{
			m[i] = i;
		}
		int j = CucumberLet.cucumber(m);
		assertEquals(10, j);
	}
	
	@Test
	public void testLettuce() 
	{
		int[] m = new int[5];
		for (int i = 0; i < m.length; i++)
		{
			m[i] = i;
		}
		int j = CucumberLet.lettuce(m, 2);
		assertEquals(1, j);

	}
	
	@Test
	public void testTomato()
	{
		int[] m = new int[5];
		for (int i = 0; i < m.length; i++)
		{
			m[i] = i;
		}
		int j = CucumberLet.tomato(m, 2);
		assertEquals(2, j);
	}

}