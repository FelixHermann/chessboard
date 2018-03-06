package learn.chessboard;

import java.util.LinkedList;
import java.util.List;

public class ChessboardImpl implements Chessboard {

	private Field start;
	private Field target;
	private List<Field> solution;
	
	public List<Field> findWay(Field start, Field target) {
		if (checkArgument(start, target)) {
			initialize(start, target);
			findWay();
			return solution;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	
	private void findWay() {
		solution.add(start);
		addFields_x();
		addFields_y();
	}

	
	private void addFields_x() {
		if (start.getX() < target.getX()) {
			addFields_x_right();
		} else if (start.getX() > target.getX()) {
			addField_x_left();
		}
	}

	private void addFields_y() {
		if (start.getY() < target.getY()) {
			addField_y_up();
		} else if (start.getY() > target.getY()) {
			addFields_y_down();
		}
	}
	
	
	private void addField_x_left() {
		for (int i = start.getX() - 1; i >= target.getX(); i--) {
			solution.add(new FieldImpl(i, start.getY()));
		}
	}

	private void addFields_x_right() {
		for (int i = start.getX() + 1; i <= target.getX(); i++) {
			solution.add(new FieldImpl(i, start.getY()));
		}
	}

	private void addField_y_up() {
		for (int i = start.getY() + 1; i <= target.getY(); i++) {
			solution.add(new FieldImpl(target.getX(), i));
		}
	}

	private void addFields_y_down() {
		for (int i = start.getY() - 1; i >= target.getY(); i--) {
			solution.add(new FieldImpl(target.getX(), i));
		}
	}
	

	private void initialize(Field start, Field target) {
		this.start = start;
		this.target = target;
		this.solution = new LinkedList<Field>();
	}

	private boolean checkArgument(Field start, Field target) {
		return (start != null && target != null);
	}
}
