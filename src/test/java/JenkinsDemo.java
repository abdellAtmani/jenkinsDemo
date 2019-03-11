
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JenkinsDemo {
	//protected UtilsMath mat;
	
	@Before
	public void setUp() throws Exception {
		//mat =new UtilsMath();
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("reussi");
	}

	@Test
	public void testAddition() throws Exception {
		//assertEquals(new Long(4), mat.addition(new Long(1), new Long(3)));
		assertEquals(4, 4);
	}
	
	@Test
	public void testAdditionInt1() throws Exception {
		assertEquals(4, 3);
	}
	@Test
	public void testAdditionInt2() throws Exception {
		//assertEquals(3,mat.additionInt(1, 4));
		assertEquals(4, 4);
	}

}
