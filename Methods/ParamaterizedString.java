package Methods;

public class ParamaterizedString {
    public static void StringAddition(String a, String b){
        String c = a+b;
        System.out.println("Concated value is : "+c);
    }

    public static void main(String[] args) {
        String a = "Vinoth ";
        String b = "Subramaniyan";
        StringAddition(a, b);
    }
}
