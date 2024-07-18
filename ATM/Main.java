package ATM;

import java.util.Scanner;
import ATM.ATMProcess;

public class Main {

    public static void main(String[] args) {
       boolean loop = true;
       while (loop) {
            System.out.println("\n1)Widthdraw\n2)Deposit\n3)Check Balance\n4)Update PIN\n5)Exit\n");
            System.out.println("Enter your choice");
            Scanner in = new Scanner(System.in);
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    ATMProcess.withdraw();
                    break;

                case 2:
                    ATMProcess.DepositAmount();
                    break;

                case 3:
                    ATMProcess.CheckBalance();
                    break;
                
                case 4:
                    ATMProcess.UpdatePin();
                    break;
            
                case 5:
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid Choice....:(");
                    break;
            }
       }
    }
}
