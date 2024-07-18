package variables;

class variable {
    public static void main(String[] args) {

        // float varibale
        float mark1 = 50.5f;
        float mark2 = 60.5f;
        float mark3 = 70.0f;
        float mark4 = 80.0f;
        float mark5 = 90.5f;
        System.out.println("Initialized value");
        System.out.println(mark1);
        System.out.println(mark2);
        System.out.println(mark3);
        System.out.println(mark4);
        System.out.println(mark5);
        System.out.println("Change value");
        mark1 = 55.5f;
        mark2 = 65.5f;
        mark3 = 75.0f;
        mark4 = 85.0f;
        mark5 = 95.5f;
        System.out.println(mark1);
        System.out.println(mark2);
        System.out.println(mark3);
        System.out.println(mark4);
        System.out.println(mark5);
        {
            // block 1
            int a = 10;
            System.out.println(a);
        }
        {
            // block 2
            int a = 20;
            System.out.println(a);
        }
        
    }
}
