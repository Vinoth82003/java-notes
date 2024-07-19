package Object_class;

public class Student {
	String name;
	char gender;
	int rollno;
	public Student(String name, char gender, int rollno) 
	{
		super();
		this.name = name;
		this.gender = gender;
		this.rollno = rollno;
	}
	
	@Override
	public String toString()
	{
		String res = "{ Name = "+name+", Gender = "+gender+", Rollno = "+rollno+"}";
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		boolean res = this.name.equals(s.name) && this.gender == s.gender && this.rollno == s.rollno;
		return res;
	}
}
