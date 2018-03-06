package learn.chessboard;

public class App {
	public static void main(String[] args) {
		Parser parser = new ParserImpl();
		parser.parse(args);
		System.out.println(new ChessboardImpl().findWay(parser.getStart(), parser.getTarget()));
	}
}
