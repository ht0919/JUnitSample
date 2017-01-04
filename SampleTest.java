import junit.framework.*;
public class SampleTest extends TestCase {
	public SampleTest(String s) {
		super(s);
	}
	public void test() throws Exception {
		Sample inst = new Sample();
		int add = inst.add(10,2);
		int sub = inst.sub(10,2);
		int mul = inst.mul(10,2);
		int div = inst.div(10,2);
		assertEquals(12, add);
		assertEquals( 8, sub);
		assertEquals(20, mul);
		assertEquals( 5, div);
	}
}
