public class CoinCounterFor {
    public static void main(String[] args) {
        int fives  = 5;
        int twos = 5;
        int ones = 5;
        int goal = 30;
        int coinsUsed = 0;
        if (((fives*5)+(twos*2)+(ones*1))>=goal) {
            for(int i=1; i<=(fives+twos+ones); i++){
                if (i*5 <=goal) {
                    if (i*5 == goal) {
                        coinsUsed++;
                        goal -= 5;
                    }
                }
            }
        }
    }
}
