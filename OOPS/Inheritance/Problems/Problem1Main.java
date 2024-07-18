package OOPS.Inheritance.Problems;

class Parent{
    int x =10;

    public static void M1()
    {
        System.out.println("Static Method In Parent");
    }

    public void M2(){
        System.out.println("Non Static Method In Child");
    }
}

class Child extends Parent{
    int y = 200;

    public static void M3(){
        System.out.println("Static method in Child");
    }

    public void M4(){
        System.out.println("Non-Statci Method in child");
    }
}

public class Problem1Main {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        System.out.println(c.x);
        System.out.println(c.y);
        p.M1();
        p.M2();
        c.M3();
        c.M4();
    }
}
