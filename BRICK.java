/**
 * BRICK
 */
public class BRICK {

    public static void main(String[] args) {
        int bigcount = 5;
        int smallcount = 2;

        int bweight = 5;
        int bv = bigcount * bweight;
        int goal = 23;

        int count = 0;
        int total = (bigcount * bweight) + smallcount;

        if (bigcount*bweight == goal || total == goal) {
            System.out.println("Count "+(bigcount+smallcount));
            System. out.println("true");
        }else
        {
            if (bv > goal) {
                int noOfGig = goal/bweight;
                System.out.println(noOfGig);
                count = noOfGig;
                int rem = goal%bweight;
                if (rem > smallcount) {
                    System.out.println("false");
                }else{
                    count+=rem;
                    System.out.println("true");
                }
            }else{
                count += bigcount;
               // System.out.println(count);
                int rem = goal%bigcount;
                if (rem > smallcount) {
                    System.out.println("false");
                }else{
                    count+=rem;
                    System.out.println("true");
                }
            }
        }
        System.out.println("Count "+count);
    }
}