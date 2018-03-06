package learn.chessboard;

import java.util.List;

public interface Chessboard {
	public List<Field> findWay(Field start, Field target);
}
