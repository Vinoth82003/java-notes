package OOPS.Encapsulation.Sim;

public class Sim {
    private long sim_no;
    private String sim_provider;
    private double sim_rate = 499.99d;

    public long getSimNumber(){
        return sim_no;
    }

    public void setSimNumber(long sim_no){
        int count = 0;
        long temp = sim_no;
        while (sim_no !=0) {
            count ++;
            sim_no /=10;
        }
        System.out.println(count);
        if (count == 10) {
            this.sim_no = temp;
        }else{
            System.out.println("Invalid Number .... :(");
        }
    }

    public String getSimName(){
        return sim_provider;
    }

    public void setSimProvider(String sim_provider){
        this.sim_provider = sim_provider;
    }

    public double getSimRate(){
        return sim_rate;
    }

    public void displayDetails(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Sim Provider : "+getSimName());
        System.out.println("Sim Number : "+getSimNumber());
        System.out.println("Sim Rate : Rs"+getSimRate()+"/-");
        System.out.println("--------------------------------------------------------");
    }

}
