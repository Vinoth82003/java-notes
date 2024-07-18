package OOPS.Inheritance;

/**
 * Example
*/

class Parent{
    int x = 400;

    public void m1(){
        System.out.println("M1 method in parent class");
    }
}

class Child extends Parent{
    int y = 600;

    public void m2(){
        System.out.println("M2 method in child class");
    }

}

public class ParentChildMain {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        Parent p = new Parent();
        System.out.println(p.x);
        p.m1();
        System.out.println("--------------------------");
        Child c = new Child();
        System.out.println(c.y);
        c.m2();
        System.out.println(c.x);
        c.m1();
    }
}