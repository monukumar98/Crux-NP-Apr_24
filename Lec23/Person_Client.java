package Lec23;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Person p = new Person("Ankita", 22);
		System.out.println(p.getName());
		p.setName("Ankit");
		System.out.println(p.getName());
		p.setAge(-10);
		System.out.println(p.getAge());
//		p.name = "Ankit";
//		System.out.println(p.name);
//		System.out.println(p.age);

	}

}
