package Lec23;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + age);

	}

	public void SayHey(String a) {

		System.out.println(this.name + " say Hey " + name);
	}

	public static void MentorName() {

		System.out.println("Monu Bhaiya");
	}

	static {
		System.out.println("Static Block in Student");
	}
}
