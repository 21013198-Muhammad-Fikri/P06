import static org.junit.Assert.*; 
 
import org.junit.After; 
import org.junit.AfterClass; 
import org.junit.Before; 
import org.junit.BeforeClass; 
import org.junit.Test; 
 
public class CalculateTest { 
 
	private int a,b,c; 
	Calculate cal; 
  
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception { 
	
	} 
 
	@AfterClass 
	public static void tearDownAfterClass() throws Exception { 
 
	} 
 
	@Before 
	public final void setUp() throws Exception { 
		a = 4321; 
		b = 1234; 
		c = 0;   
		cal = new Calculate(); 
 
 
	} 
 
	@After 
	public final void tearDown() throws Exception { 
	} 
 
	@Test 
	public final void testAdd() { 
		int actual = cal.add(a, b);  
      
		int expected = 5555; 
		assertEquals (expected, actual); 
 
	} 
  
	@Test 
	public final void testSubtract() { 
		int actual = cal.substract(a, b);  
     
		int expected = 3087; 
		assertEquals (expected, actual); 
	} 
  
	@Test 
	public final void testMultiply() { 
 
		int actual = cal.multiply(a, b);  
     
		int expected = 5332114; 
		assertEquals (expected, actual); 
 
	} 
 
	@Test 
	public final void testDivide() { 
		int actual = cal.divide(a, b);  
     
		int expected = 3; 
		assertEquals (expected, actual); 
	} 
  
	@Test 
	public final void testDivideBy0() { 
		try { 
			cal.divide(a,c); 
			fail("Expected an IllegalArgumentException to be thrown"); 
		} 
		
		catch (IllegalArgumentException e){ 
			assertEquals("Division by zero is not supported", e.getMessage()); 
		} 
		catch(Throwable t) { 
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage()); 
		} 
	} 
  
 
}