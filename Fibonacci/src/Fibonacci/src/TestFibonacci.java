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
	    iter.next();
	    iter.next();
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
	@Test
	public void test0() {
	    FiboIterator iter = new FiboIterator(0);
	    assertFalse(iter.hasNext());
	}
	@Test
	public void testValeurInvalide() {
	    FiboIterator iter = new FiboIterator(-1);
	    assertFalse(iter.hasNext());
	}

	@Test
	public void testNegatif() {
	    FiboIterator iter = new FiboIterator(-1);
	    assertFalse(iter.hasNext());
	}

	@Test
	public void test1() {
	    FiboIterator iter = new FiboIterator(1);
	    assertTrue(iter.hasNext());
	    assertEquals(1, iter.next().intValue());
	    assertFalse(iter.hasNext());
	}

	@Test
	public void test2() {
	    FiboIterator iter = new FiboIterator(2);
	    assertTrue(iter.hasNext());
	    assertEquals(1, iter.next().intValue());
	    assertTrue(iter.hasNext());
	    assertEquals(1, iter.next().intValue());
	    assertFalse(iter.hasNext());
	}
	

}
