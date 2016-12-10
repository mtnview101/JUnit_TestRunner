import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ATest{
	@Test
	public void Test(){
		System.out.println("Expected String: Testing Junit 4.12; Actual String: "+ A.s);
		assertEquals("String not the same", "Testing Junit 4.12", A.s);
	}
}