package Lec37;

import java.util.*;
import java.util.HashMap;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Group(arr));
	}

	public static List<List<String>> Group(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String key = Anagram_Key(arr[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(arr[i]);
		}
		List<List<String>> ans = new ArrayList<>();
		for (String s : map.keySet()) {
			ans.add(map.get(s));
		}
		return ans;
	}

	public static String Anagram_Key(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;// freq[ch - 'a']= freq[ch - 'a']+1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]);
		}
		return sb.toString();

	}
}
