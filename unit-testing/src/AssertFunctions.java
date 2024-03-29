import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertFunctions {
	public void testAssert() {
		String s1 = "Junit";
		String s2 = "Junit";
		
//		assertEquals(s1,s2);
		assertSame(s1,s2);
		assertNotSame(s1,s2);
		assertNotNull(s1,s2);
		assertNull(s1,s2);
		
		int n1 = 10;
		int n2 = 20;
		
		assertTrue(n1 > n2);
		assertFalse(n1 > n2);
		
		
	}

}
