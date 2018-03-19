package learn.chessboard;

import java.util.List;

import org.junit.Test;


public class ChessboardTest {

	@Test
	public void test1() {
		Chessboard chessboard = new ChessboardImpl();
		List<Field> solution = chessboard.findWay(new FieldImpl(1, 1), new FieldImpl(1, 1));
		assert(solution.get(0).equals(new FieldImpl(1, 1)));
		assert(solution.size() == 1);
	}

	@Test
	public void test2() {
		Chessboard chessboard = new ChessboardImpl();
		List<Field> solution = chessboard.findWay(new FieldImpl(1, 1), new FieldImpl(1, 2));
		assert(solution.size() == 2);
		assert(solution.get(1).equals(new FieldImpl(1, 2)));
	}
	
	@Test
	public void test3() {
		Chessboard chessboard = new ChessboardImpl();
		List<Field> solution = chessboard.findWay(new FieldImpl(5, 3), new FieldImpl(2, 2));
		assert(solution.size() == 5);
		assert(solution.get(3).equals(new FieldImpl(2,  3)));
	}
}