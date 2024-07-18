package Methods.ReturnMethods;

public class ReturnString {
    public static String ReturnStringValue(){
        String name1 = "Vinoth";
        String name2 = "Subramaniyan";

        String Concated = name1+" "+name2;

        return Concated;
    }

    public static void main(String[] args) {
        String answer = ReturnStringValue();

        System.out.println(answer);
    }
}
