import java.util.Scanner;

public class CoinCounter {

    public static int countCoins(int amount, int coin5Count, int coin2Count, int coin1Count) {
        int totalCoinsUsed = 0;

        // Using 5 rupee coins
        while (amount >= 5 && coin5Count > 0) {
            amount -= 5;
            coin5Count--;
            totalCoinsUsed++;
        }

        // Using 2 rupee coins
        while (amount >= 2 && coin2Count > 0) {
            amount -= 2;
            coin2Count--;
            totalCoinsUsed++;
        }

        // Using 1 rupee coins
        while (amount >= 1 && coin1Count > 0) {
            amount -= 1;
            coin1Count--;
            totalCoinsUsed++;
        }

        if (amount != 0) {
            System.out.println("Cannot make the exact amount with the given coins.");
            return -1;
        }

        return totalCoinsUsed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        
        System.out.print("Enter the number of 5 rupee coins: ");
        int coin5Count = scanner.nextInt();
        
        System.out.print("Enter the number of 2 rupee coins: ");
        int coin2Count = scanner.nextInt();
        
        System.out.print("Enter the number of 1 rupee coins: ");
        int coin1Count = scanner.nextInt();

        int result = countCoins(amount, coin5Count, coin2Count, coin1Count);
        if (result != -1) {
            System.out.println("Total coins used: " + result);
        }
    }
}
