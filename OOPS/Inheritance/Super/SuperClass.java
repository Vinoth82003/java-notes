package OOPS.Inheritance.Super;

class Demo{
    Demo(int x, int y){
        this(20);
        System.out.println("hello");
        System.out.println(x+""+y);    
    }
    Demo(int x){
        System.out.println(x);
    }

    Demo(){

    }
}

class Sample extends Demo{
    Sample(){
        super(20);
        System.out.println("No arg Sample");
    }

    Sample(int x, int y){
        super(x,y);
        System.out.println("args ");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Sample s =new Sample(50,100);
        System.out.println("--------------------");
        System.out.println(10+' '+20);
    }
}
