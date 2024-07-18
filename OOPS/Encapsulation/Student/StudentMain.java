package OOPS.Encapsulation.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------Welcome to Student Management System----------------------------\n");
        System.out.println("How many Students you are going to add....!");
        int objLength = input.nextInt();

        Student obj [] = new Student[objLength];
        for (int i = 0; i < obj.length; i++) {
            System.out.println();
            System.out.print("Student Name: ");
            String name = input.next();
            System.out.print("Student RollNo: ");
            int roll_no = input.nextInt();
            System.out.print("Student Age: ");
            int age = input.nextInt();
            System.out.print("Student Phone Number: ");
            long phone_number = input.nextLong();
            System.out.println();
            Student Stud = new Student(name, roll_no, age, phone_number);
            obj[i] = Stud;

        }

        boolean exit = false;

        while (!exit) {
        System.out.println("\nWhat student you want to change ");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(i+1+") "+obj[i].getStudetnName());
        }
        System.out.println("0) exit");
        System.out.println("Select student ..!");
        int index = input.nextInt();
        if (index == 0) {
            System.out.println("Exiting process....!");
            exit = true;
            break;
        }
        System.out.println("the selected Student details are ");
        obj[index-1].displayDetails();

        System.out.println("----------------------------------------------");
        System.out.println("\n1) Student Name\n2)Student Rollnumber\n3)Student Age\n4)Student Number\n5)Exit\n");
        System.out.println("What operation you want to  do...!");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("You have selected to change Student Name ");
                System.out.println("1)Display Name\n2)Change Name\n3) Exit");
                int ch = input.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print(obj[index-1]);
                        System.out.println(obj[index-1].getStudetnName());
                        break;
                    
                    case 2:
                        System.out.print("Enter new Name : ");
                        String name = input.next();
                        obj[index-1].setStudentName(name);
                        System.out.println("Changed Name "+obj[index-1].getStudetnName());
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("You have selected Student Roll No ");
                System.out.println("1)Display RollNo\n2)Exit");
                int ch2 = input.nextInt();
                switch (ch2) {
                    case 1:
                        System.out.println(obj[index-1].getRollNo());
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("You have selected change Student Age ");
                System.out.println("1).Display Age\n2).Change Age\n3).Exit");
                int ch3 = input.nextInt();
                switch (ch3) {
                    case 1:
                        System.out.println(obj[index-1].getStudetnAge());
                        break;
                    case 2:
                        System.out.println("Enter Age ");
                        int age = input.nextInt();
                        obj[index-1].setStudetnAge(age);
                        System.out.println("Changed Age "+obj[index-1].getStudetnAge());
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                System.out.println("You have selected change Student Age ");
                System.out.println("1).Display Number\n2).Change Number\n3).Exit");
                int ch4 = input.nextInt();
                switch (ch4) {
                    case 1:
                        System.out.println( obj[index-1].getStudentNumber());
                        break;
                    case 2:
                        System.out.println("Enter Number ");
                        long phnumber = input.nextLong();
                        obj[index-1].setPhoneNumber(phnumber);
                        System.out.println("Changed Number "+obj[index-1].getStudentNumber());
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        }

        System.out.println("\n-----------------------------------------------------------------------------------");
        input.close();
    }
}
