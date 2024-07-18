public class Swap {

    public static void PlusMethod(int a, int b){
        System.out.println("---------------Before Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("---------------After Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
    }

    public static void MulMethod(int a, int b){
         System.out.println("---------------Before Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("---------------After Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
    }

    public static void XorMethod(int a, int b){
         System.out.println("---------------Before Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("---------------After Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
    }

    public static void SingleLine(int a, int b){
        System.out.println("---------------Before Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
        a = b - a + (b = a);
        System.out.println("---------------After Swap----------");
        System.out.println("A = "+a+" -- B = "+b);
    }
    public static void main(String[] args) {
        int x =2;
        int y = 3;
        PlusMethod(x,y);
        MulMethod(x, y);
        XorMethod(x, y);
        SingleLine(x, y);
        int temp ;
        System.out.println("---------------Before Swap----------");
        System.out.println("X = "+x+" -- Y = "+y);
        temp = x; 
        x = y;
        y = temp;
        System.out.println("---------------After Swap----------");
        System.out.println("X = "+x+" -- Y = "+y);

    }
}
