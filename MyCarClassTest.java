package console.program;
import org.junit.*;
public class MyCarClassTest {
	private MyCar cars;
	
	@Before
	public void setup()
	{
		cars = new MyCar(null);
	}
	@Test
	public void testrun_Invalid()
	{
		cars.run('e');
	}
	

}
