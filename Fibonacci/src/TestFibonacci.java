import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFibonacci {

	@Test
	public void testHasNext() {
	    FiboIterator iter = new FiboIterator(4);
	    assertTrue(iter.hasNext());
	    iter.next();
	    assertTrue(iter.hasNext());
	    iter.next();
	    assertTrue(iter.hasNext());
	    iter.next();
	    assertTrue(iter.hasNext());
	    iter.next();
	  
	}

	@Test
	public void testNext() {
	    FiboIterator iter = new FiboIterator(10);
	    assertEquals(1, iter.next().intValue());
	    assertEquals(2, iter.next().intValue());
	    assertEquals(3, iter.next().intValue());
	    assertEquals(5, iter.next().intValue());
	    assertEquals(8, iter.next().intValue());
	    assertEquals(13, iter.next().intValue());
	    assertEquals(21, iter.next().intValue());
	    assertEquals(34, iter.next().intValue());
	    assertEquals(55, iter.next().intValue());
	    assertEquals(89, iter.next().intValue());
	}
	

}
