package OOPS.Encapsulation.Mobile;

import java.util.Scanner;

/**
 * MobileDriver
 */
class Sim{
    String sim_name = "jio";
}

class Mobile{
    Sim Slot;

    public void addSim(Sim Slot){
        if (this.Slot == null) {
            this.Slot = Slot;
            System.out.println("-----------------------------\nSim Inserted Successfully");
        }else{
            System.out.println("------------------------------\nSim is already Inserted....!");
        }
    }

    public void removeSim(){
        if (this.Slot == null) {
            System.out.println("----------------------------------\nSim is not there..Please insert Sim");
        }else{
            this.Slot = null;
            System.out.println("------------------------------------\nSim is Removed ........!");
        }
    }
}

public class MobileDriver {

    public static void main(String[] args) {
        // main program here 
        Boolean exit = true;
        Mobile ph1 = new Mobile();
        Sim jio = new Sim();
        Scanner input = new Scanner(System.in);
        while (exit) {
            System.out.println("---------------------------------------\n1).Insert Sim\n2).Remove Sim\n3).Exit");
            System.out.println("Select the option.......:)\n-----------------------------------------------------");
            int ch = input.nextInt();
            switch (ch) {
                case 1:
                     ph1.addSim(jio);
                    break;
                case 2:
                    ph1.removeSim();
                    break;
                case 3:
                    exit = false;
                default:
                    break;
            }
        }
        input.close();
    }
    
}