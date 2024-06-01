package Lec9;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int k = 0;
		while (k <= j) {
			if (arr[k] == 2) {// swap k & j
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				j--;

			} else if (arr[k] == 0) {// swap i & k
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				i++;
				k++;
			} else {
				k++;
			}
		}
	}
}


