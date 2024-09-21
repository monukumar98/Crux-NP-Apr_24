package Lec33;

public interface StackI {
	public static final int x = 9;

	public void push(int item);

	public int pop();

	public int peek();

	// java8
	public static void fun() {

	}

	default void fun1() {

	}

	// java 9
	private static void fun2() {

	}

	private void fun3() {

	}

}
