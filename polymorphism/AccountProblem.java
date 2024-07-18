package polymorphism;

import java.util.Arrays;

class Account{
    long AccountNo ;
    String AccountHolderName;
    String IFSC ;

    Account (){

    }

    Account(long AccountNo, String AccountHolderName, String IFSC){
        this.AccountNo = AccountNo;
        this.AccountHolderName = AccountHolderName;
        this.IFSC = IFSC;   
    }
}

class Bank{
    Account allAcounts[] = {
        new Account(1234, "Vinoth", "1A2B"),
        new Account(4321, "Srinivas", "A1B1"),
        new Account(5678, "Venu", "3C4D"),
        new Account(8765, "Santh", "C3D4"),
        new Account(9123, "Surya", "E5F6")
    } ;
    
    public void search(long AccountNo){
        boolean found = false;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < allAcounts.length; i++) {
            if (AccountNo == allAcounts[i].AccountNo) {
                found = true;
                index = i;

            }
        }
        if (found) {
            System.out.println("User found ");
            System.out.println("User Name - "+allAcounts[index].AccountHolderName);   
        }else{
            System.out.println("not found");
        }
    }

    public void search(long AccountNo , String AccountHolderName){
        boolean found = false;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < allAcounts.length; i++) {
            if (AccountNo == allAcounts[i].AccountNo && AccountHolderName == allAcounts[i].AccountHolderName) {
                found = true;
                index = i;
            }
        }
        if (found) {
            System.out.println("User found ");
            System.out.println("User Name - "+allAcounts[index].AccountHolderName);
        }else{
            System.out.println("not found");
        }
    }

    public void search(String AccountHolderName){
        boolean found = false;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < allAcounts.length; i++) {
            if (AccountHolderName == allAcounts[i].AccountHolderName) {
                found = true;
                index = i;
            }
        }
        if (found) {
            System.out.println("User found ");
            System.out.println("User Name - "+allAcounts[index].AccountHolderName);
        }else{
            System.out.println("not found");
        }
    }

    public void search(String AccountHolderName, long AccountNo, String IFSC){
        boolean found = false;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < allAcounts.length; i++) {
            if (AccountNo == allAcounts[i].AccountNo && AccountHolderName == allAcounts[i].AccountHolderName && IFSC == allAcounts[i].IFSC) {
                found = true;
                index = i;
            }
        }
        if (found) {
            System.out.println("User found ");
            System.out.println("User Name - "+allAcounts[index].AccountHolderName);
        }else{
            System.out.println("not found");
        }
    }
}

public class AccountProblem {
    
    public static void main(String[] args) {
        Bank bnk = new Bank();
        System.out.println("----------------------------");
        bnk.search(1234);
        System.out.println("----------------------------");
        bnk.search("Srinivas");
        System.out.println("----------------------------");
        bnk.search("Venu", 1234, "ABCD");
        System.out.println("----------------------------");
        bnk.search(4321, "Srinivas");
        System.out.println("----------------------------");
    }
}
