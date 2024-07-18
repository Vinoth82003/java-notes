package loops;

public class LetterPattern {

    public static void V(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (i==1) {
                    if (j==3||j==4||j==5) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==2) {
                    if (j==0||j==8||j==4) {
                       System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==3) {
                    if (j==0||j==1||j==4||j==8||j==7) {
                       System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==4) {
                    if (j==0||j==1||j==2||j==6||j==7||j==8) {
                       System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==5) {
                    if (j==4) {
                       System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
       }
    }
    
    public static void I(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (j==3||j==4||j==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void N(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (i==1) {
                    if (j==3||j==4||j==5||j==6) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==2) {
                    if (j==4||j==5||j==6) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==3) {
                    if (j==2||j==5||j==6) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==4) {
                    if (j==2||j==3||j==6) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                if (i==5) {
                    if (j==2||j==3||j==4||j==5) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void O(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (i==0||i==5) {
                   if (j==0||j==1||j==7||j==8) {
                    System.out.print(" ");
                   } else {
                    System.out.print("*");
                   }
                }
                if (i==1||i==4) {
                    System.out.print("*");
                }
                if (i==2||i==3) {
                    if (j==2||j==3||j==4||j==5||j==6) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

    }
   
   public static void T(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (i==0||i==1) {
                    System.out.print("*");
                }else{
                    if (j==3||j==4||j==5) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
   }
   
   public static void H(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (i==0||i==1||i==4||i==5) {
                    if (j==0||j==1||j==7||j==8) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if (j==2||j==6) {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
   }
   
   public static void main(String[] args) {
        V();
        sleep(2000);
        
        I();
        sleep(2000);
        
        N();
        sleep(2000);
        
        O();
        sleep(2000);
        
        T();
        sleep(2000);
        
        H();
    }
    
    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}
