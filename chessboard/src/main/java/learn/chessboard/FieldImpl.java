package learn.chessboard;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
				append(x).append(y).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!(obj instanceof FieldImpl)) {
			return false;
		} else {
			FieldImpl other = (FieldImpl) obj;
			return new EqualsBuilder().append(x, other.x).append(y, other.y).isEquals();	
		}
	}
}
