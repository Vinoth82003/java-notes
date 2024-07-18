
abstract class RBI{

    abstract public int ROI();
}

class SBI extends RBI{
    int RateOFInterest = 15;
    @Override
    public int ROI(){
        return this.RateOFInterest;
    }
}

class Axis extends RBI{
    int RateOFInterest = 20;
    @Override
    public int ROI(){
        return this.RateOFInterest;
    }
}

public class RBIDriver {
    public static void main(String[] args) {
        RBI r;

        System.out.println("_------------------------------------_");
        System.out.println("\nState bank of India..");
        r = new SBI();
        System.out.println("Rate of interest  | "+r.ROI()+" |");
        System.out.println("\nAxis Bank..");
        r = new Axis();
        System.out.println("Rate of interest  | "+r.ROI()+" |");
        System.out.println("_------------------------------------_");
    }
}
