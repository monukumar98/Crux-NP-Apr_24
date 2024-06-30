package Lec16;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 4;// matrix n*m
		Print(n - 1, m - 1, 0, 0, "");
	}

	// er--> end row
	// ec--> end col
	// cr--> curr row
	// cc--> curr col
	public static void Print(int er, int ec, int cr, int cc, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		Print(er, ec, cr, cc + 1, ans + "H");
		Print(er, ec, cr + 1, cc, ans + "V");
	}

}
