package Lec37;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 87);
		map.put("Kunal", 58);
		map.put("Ankita", 78);
		map.put("Ankit", 87);
		map.put("Kaju", 79);
		map.put("Amisha", 77);
		map.put("Manoj", 68);
		map.put("Puneet", 57);
		map.put("Kaju", 6);
		map.put("Kaju", 179);
		System.out.println(map.containsKey("Kunal"));
		System.out.println(map.get("Kaju"));
		System.out.println(map);
	}

}
