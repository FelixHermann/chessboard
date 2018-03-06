package learn.chessboard;

public interface Parser {
	public void parse(String arg);
	public Field getStart();
	public Field getTarget();
}