package learn.chessboard;

public class ParserImpl implements Parser {

	private Field start;
	private Field target;
	
	public void parse(String[] args) {
		start = new FieldImpl(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		target = new FieldImpl(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
	}

	public Field getStart() {
		return start;
	}

	public Field getTarget() {
		return target;
	}
}
