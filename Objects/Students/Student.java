package Objects.Students;

public class Student {
    static String CollegeName = "Panimalar Engineering College";
    String name ;
    int roll_no;
    long ph_no;
    char gender;
    public Student(String name, int roll_no, long ph_no, char gender){
        this.name = name;
        this.roll_no = roll_no;
        this.ph_no = ph_no;
        this.gender = gender;
    }
    
    public void displayDetails(){
        System.out.println("Collge Name: "+CollegeName);
        System.out.println("Student Name: "+name);
        System.out.println("Roll No: "+roll_no);
        System.out.println("Gender: "+gender);
    }
}
