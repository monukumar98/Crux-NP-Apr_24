package Lec14;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="127";
		print(s);

	}
	public static void print(String s) {
		int c=0;
		boolean [] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str=s.substring(i,j);// i to j-1 tk char liya hoga
				if(Is_Cb_Number(Long.parseLong(str))==true && Isvalid(visited,i,j-1)==true) {
					c++;
					for (int k = i; k <j; k++) {
						visited[k]=true;
					}
				}
			}
		}
		System.out.println(c);

	}

	public static boolean Isvalid(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for (int k = si; k <=ei; k++) {
			if(visited[k]==true) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean Is_Cb_Number(long num) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		// point 1
		if (num == 0 || num == 1) {
			return false;
		}
		// point 2
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		// point 3
		for (int i = 0; i < arr.length; i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
