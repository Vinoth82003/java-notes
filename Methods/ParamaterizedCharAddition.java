package Methods;

public class ParamaterizedCharAddition {
    public static void CharAdd(char a, char b){
        int c = a+b;

        System.out.println("The char addition value is : "+c);
    }

    public static void main(String[] args) {
        char a = 'v';
        char b = 'r';

        CharAdd(a, b);
    }
}
