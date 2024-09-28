package Lec36;

import java.util.*;

public class HashMap_Demo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		// add
		// map.put(null, 61);
		map.put("Raj", 87);
		map.put("Kunal", 58);
		map.put("Ankita", 78);
		map.put("Ankit", 87);
		map.put("Kaju", 79);
		map.put("Amisha", 77);
		map.put("Manoj", 68);
		map.put("Puneet", 57);
		map.put("Kaju", 6);
		// map.put(null, 6);
		System.out.println(map);
//		// get value
//		System.out.println(map.get("Anku"));
//		System.out.println(map.get("Amisha"));
//		// containkey
//		System.out.println(map.containsKey("Anku"));
//		System.out.println(map.containsKey("Amisha"));
//		//remove
//		System.out.println(map.remove("Anku"));
//		System.out.println(map.remove("Amisha"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		// map.put(null, 61);
		map1.put("Raj", 87);
		map1.put("Kunal", 58);
		map1.put("Ankita", 78);
		map1.put("Ankit", 87);
		map1.put("Kaju", 79);
		map1.put("Amisha", 77);
		map1.put("Manoj", 68);
		map1.put("Puneet", 57);
		map1.put("Kaju", 6);
		// map1.put(null, 6);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		// map.put(null, 61);
		map2.put("Raj", 87);
		map2.put("Kunal", 58);
		map2.put("Ankita", 78);
		map2.put("Ankit", 87);
		map2.put("Kaju", 79);
		map2.put("Amisha", 77);
		map2.put("Manoj", 68);
		map2.put("Puneet", 57);
		map2.put("Kaju", 6);
		// map.put(null, 6);
		System.out.println(map2);

//		Set<String> set = map.keySet();
//		for (String key : set) {
//			System.out.println(key + " " + map.get(key));
//		}
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}

	}

}
