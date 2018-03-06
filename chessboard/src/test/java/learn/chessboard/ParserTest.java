package learn.chessboard;

import org.junit.Test;

public class ParserTest {

	@Test
	public void test() {
		Parser parser = new ParserImpl();
		parser.parse("1 2 3 4");
		System.out.println(parser.getStart());
		assert(parser.getStart().sameAs(new FieldImpl(1, 2)));
	}
}
