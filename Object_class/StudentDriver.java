package Object_class;

public class StudentDriver {
	public static void main(String[] args) 
	{
		Student s1 = new Student("Srinivas",'m',208);
		Student s2 = new Student("Srinivas",'m',208);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
		
	}
}

