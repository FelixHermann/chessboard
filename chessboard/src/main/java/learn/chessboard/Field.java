package learn.chessboard;

public interface Field {
	public int getX();
	public int getY();
	public boolean sameAs(Field field);
}