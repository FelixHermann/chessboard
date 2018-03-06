package learn.chessboard;

public interface Parser {
	public void parse(String[] args);
	public Field getStart();
	public Field getTarget();
}