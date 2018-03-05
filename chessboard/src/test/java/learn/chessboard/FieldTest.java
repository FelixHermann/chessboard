package learn.chessboard;

import org.junit.Test;


public class FieldTest {
	
	@Test
	public void functionalTest() {
		Field field = new FieldImpl(1, 1);
		assert(field.getX() == 1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument() {
		new FieldImpl(0, 1);
	}
}
