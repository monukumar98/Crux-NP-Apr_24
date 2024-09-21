package Lec34;

public class Pair<P, Q> {
	P x;
	Q y;

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public Pair(P x, Q y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
}
