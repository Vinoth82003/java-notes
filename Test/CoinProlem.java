package Test;

public class CoinProlem {
    public static void main(String[] args) {
        int five = 5;
        int two = 5;
        int one = 5;
        int totalAmount = ((1*one)+(2*two)+(5*five));
        int target = 39;
        int coins = 0;
        if (target >= totalAmount) {
            System.out.println("Insufficient Balance");
        }else{
            if (target/5 >5) {
                target -= 25;
                coins +=5;
                if (target/2 >5) {
                    target -=10;
                    coins +=5;
                    target/=1;
                    coins += target;
                    System.out.println(coins);
                }
            }
        }
    }
}
