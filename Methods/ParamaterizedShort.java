package Methods;

public class ParamaterizedShort {
    public static void ShortMethod(short a){
        System.out.println("The short value is : "+a);
    }

    public static void main(String[] args) {
        short a = 69;
        ShortMethod(a);
    }
}