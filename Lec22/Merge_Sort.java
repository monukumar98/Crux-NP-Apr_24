package Lec22;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 3, 4, 1 };
		int []a= Sort(arr, 0, arr.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static int[] Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei) / 2;
		int[] f = Sort(arr, si, mid);
		int[] s = Sort(arr, mid + 1, ei);
		return Merge(f, s);
	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}
