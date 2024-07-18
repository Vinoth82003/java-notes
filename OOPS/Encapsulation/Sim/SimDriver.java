package OOPS.Encapsulation.Sim;

import java.util.Scanner;

public class SimDriver {
    public static void main(String[] args) {
        Sim sim[] = new Sim[2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < sim.length; i++) {
            Sim sc = new Sim();
            System.out.println("***********************************\n");
            System.out.print("Enter Sim Provider : ");
            String provider = input.next();
            sc.setSimProvider(provider);
            
            System.out.print("Enter Sim Number : ");
            long sim_no = input.nextLong();
            sc.setSimNumber(sim_no);
            sim[i] = sc;
            System.out.println("\n***********************************\n");
        }

        for (int i = 0; i < sim.length; i++) {
            sim[i].displayDetails();
        }

        input.close();
    }
}
