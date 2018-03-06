package learn.chessboard;

public class ParserImpl implements Parser {

	private Field start;
	private Field target;
	
	public void parse(String arg) {
		String[] tokens = arg.split(" ");
		start = new FieldImpl(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		target = new FieldImpl(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
	}

	public Field getStart() {
		return start;
	}

	public Field getTarget() {
		return target;
	}
}
