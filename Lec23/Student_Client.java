package Lec23;
//import java.util.ArrayList;
public class Student_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> ll = new ArrayList<>();
		System.out.println("Hello");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Kaju";
		s.age = 20;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Raju";
		s1.age = 21;
		s1.Intro_yourSelf();
		s.SayHey("Amit");
		Student.MentorName();
		// s1.MentorName();
	}
	static {
		System.out.println("Static Block in Main");
	}

}
