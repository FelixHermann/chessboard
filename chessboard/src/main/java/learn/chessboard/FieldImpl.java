package learn.chessboard;

public class FieldImpl implements Field {
	private int x;
	private int y;
	
	public FieldImpl(int x, int y) {
		if (checkArgument(x, y)) {
			initialize(x, y);
		} else {
			throw new IllegalArgumentException("All arguments have to be greater than zero!");
		}
	}

	private void initialize(int x, int y) {
		this.x = x;
		this.y = y;
	}

	static private boolean checkArgument(int x, int y) {
		return (x > 0 && y > 0);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean sameAs(Field field) {
		return this.x == field.getX() && this.y == field.getY();
	}

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
