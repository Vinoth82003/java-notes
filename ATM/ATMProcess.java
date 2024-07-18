package ATM;

import java.util.Scanner;

public class ATMProcess {
    static float balance ;
    static int otp ; //pin
    static int AccountNumber ;
    static int OTP;
    static{
        balance = 100000.0f;
        otp = 1234; //pin
        AccountNumber = 123456789;
    }

    public static Boolean CheckAccountNumber(int AccNo){
        if (AccNo == ATMProcess.AccountNumber) {
            return true;
        }
        return false;
    }

    public static Boolean CheckValidAmount(float Amount){
        if (Amount > 500.0 && Amount <= ATMProcess.balance) {
            return true;
        }
        return false;
    }

    public static Boolean CheckPin(int pin){
        if (pin == ATMProcess.otp) {
            return true;
        }
        return false;
    }

    public static float Deposit(float Amount){
        ATMProcess.balance += Amount;
        return ATMProcess.balance;
    }

    public static int Loopotp(){
        int min = 1000;
        int max = 10000;
        ATMProcess.OTP = (int)(Math.random()*(max - min) + min);
        return ATMProcess.OTP;
    }

    public static Boolean withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("----------------- Welcome to widthdraw -----------------------\n");
        System.out.print("Please enter your 9 digit accountNumber : ");
        int AccNo = input.nextInt();
        Boolean verifyAccount = CheckAccountNumber(AccNo);
        if (verifyAccount) {
            System.out.println();
            System.out.print("Enter Amount : ");
            float Amount = input.nextFloat();
            Boolean verifyBalance = CheckValidAmount(Amount);
            if (verifyBalance) {
                System.out.println();
                System.out.print("Enter PIN :");
                int pin = input.nextInt();
                Boolean verifyPin = CheckPin(pin);
                if (verifyPin) {
                    int OTP = Loopotp();
                    System.out.println("Your OTP is : "+OTP);
                    System.err.println("****************************");
                    System.out.println("Enter Your OTP: ");
                    int userOtp = input.nextInt();
                    if (userOtp == ATMProcess.OTP) {
                        System.out.println("****** OTP is Verified ***************\n");
                        ATMProcess.balance = ATMProcess.balance - Amount;
                        System.out.println("Amount withdrawed is : "+Amount);
                        System.out.println("Updated balance : "+ATMProcess.balance);
                        return true;
                    }else{
                        System.out.println("Invalid OTP \n Try again :(");
                        return false;
                    }
                }else{
                    System.out.println("invalid Pin \n Try agian");
                    return false;
                }
            }else{
                System.out.println("Insufficent Balance ");
                return false;
            }
        }else{
            System.out.println("Invalid Account Number :( ");
            return false;
        }
    }

    public static boolean DepositAmount(){

        System.out.println("-----------------------Welcome to Deposit-------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int AccNo = input.nextInt();
        boolean verifyAccount = CheckAccountNumber(AccNo);
        if (verifyAccount) {
            System.out.println("Enter Deposit Amount ");
            float Amount = input.nextInt();
            if (Amount >=500.0) {
                float verifyDeposit = Deposit(Amount);
                System.out.println("Successfully Deposit");
                System.out.println("Your Balance : "+verifyDeposit);
                return true;
            }else{
                System.out.println("Enter amount more than Rs 500/-");
                return false;
            }
        }else{
            System.out.println("Invalid Account Number :(");
            return false;
        }

    }

    public static Boolean UpdatePin(){
        System.out.println("--------------------Update PIN----------------------");
        System.out.println("Enter 9 digit account Number : ");
        Scanner input = new Scanner(System.in);
        int AccNo = input.nextInt();
        boolean verifyAccount = CheckAccountNumber(AccNo);
        if (verifyAccount) {
            System.err.println("******************************");
            System.out.println("Your Otp is : "+Loopotp());
            System.err.println("******************************");
            System.out.println("Enter OTP: ");
            int OTP = input.nextInt();
            if (OTP == ATMProcess.OTP) {
                int newPin ;
                System.out.print("Enter New PIN: ");
                newPin = input.nextInt();
                System.out.println("Confirm PIN: ");
                int confirmPin = input.nextInt();
                if (newPin == confirmPin) {
                    ATMProcess.otp = newPin;
                    System.out.println("PIN Changed successfully.........");
                    return true;
                }else{
                    System.out.println("Confirm PIN must match New PIN");
                    return false;
                }
            }else{
                System.out.println("Invalid OTP ");
                return false;
            }
        }else{
            System.out.println("Invalid Account Number:");
            return false;
        }
    }

    public static Boolean CheckBalance(){
        System.out.println("Your Balance is : "+ATMProcess.balance);
        return true;
    }


}
