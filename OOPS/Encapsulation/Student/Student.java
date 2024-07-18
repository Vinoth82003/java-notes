package OOPS.Encapsulation.Student;

// - private
// + public
// # protected

public class Student {
    private String name;
    private int roll_no;
    private int age;
    private long phone_number;

    public void setStudentName(String name){
        this.name = name;
    }

    public String getStudetnName(){
        return name;
    }

    public void setStudetnAge(int age){
       if (age >0) {
         this.age = age;
       }else{
        System.out.println("Invalid Age input...!");
       }
    }

    public int getStudetnAge(){
        return age;
    }

    public int getRollNo(){
        return roll_no;
    }

    public void setPhoneNumber(long phone_number){
        int count = 0;
        long temp = phone_number;
        while (phone_number !=0) {
            count ++;
            phone_number /=10;
        }
        if (count == 10) {
            this.phone_number = temp;
        }else{
            System.out.println("Invalid Number .... :(");
        }
    }

    public long getStudentNumber(){
        return this.phone_number;
    }
   
    public void displayDetails(){
        System.out.println("**************** Student Details ********************");
        System.out.println("Name :"+getStudetnName());
        System.out.println("Roll No :"+getRollNo());
        System.out.println("Age :"+getStudetnAge());
        System.out.println("Phone Number :"+getStudentNumber());
        System.out.println("*****************************************************");
    }

    public Student(String name, int roll_no, int age, long phone_number){
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
        this.phone_number = phone_number;
    }

}
