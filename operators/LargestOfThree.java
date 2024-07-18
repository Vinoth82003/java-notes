package operators;

public class LargestOfThree {
    public static void main(String[] args) {
        int a =15;
        int b =100;
        int c = 20;
        String res = (a>b?
                        // if a is greater than b
                        (a>c?
                            // if a is greater than c
                            ("A is greater") 
                            :
                            // if c is greater than a
                            ("C is greater"))
                        :
                        // if b is greater than a
                        (b>c?
                            // if b is greater than c
                            ("B is greater")
                            :
                            // if c is greater than b
                            ("C is greater"))
                    );
        System.out.println(res);
    }
}
