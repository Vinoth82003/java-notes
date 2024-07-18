package Non_Primitive_casting;

    class Parent{
        String name = "parent";
    }
    class Child extends Parent{
        int age = 22;
    }
    class Child2 extends Parent{
        int age = 21;
    }

public class Casting1 {

    public static void main(String[] args) {
        // Parent p = new Child();
        // System.out.println(p.name);
        // System.out.println("Up-casted");       
        // Child c = (Child)p;
        // System.out.println(c.age);       
        // System.out.println(c.name);   
        // System.out.println("Down-casted");    
        // Parent p = new Parent();
        // Child c = (Child)p;
        // System.out.println(c.name);
        // System.out.println(c.age);
        Child c = new Child();
        Parent P = c;
        System.out.println(P.name);
        Parent p1 = new Child2();
        // System.out.println(P.age);
        // System.out.println(p1.age);
        Child2 c2 = (Child2)p1;

        System.out.println(c2.name);
        System.out.println(c2.age);


    }
}
