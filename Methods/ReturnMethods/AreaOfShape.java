package Methods.ReturnMethods;

import java.util.Scanner;

public class AreaOfShape {
    public static float AreaOfTriangle(int a, int b){
        float area = 0.5f * a * b;
        return area;
    }

    public static float AreaOfCircle(int r){
        float area = 3.14f*r*r;
        return area;
    }

    public static int AreaOfCube(int a){
        int area = a*a*a;
        return area;
    }

    public static int AreaOfCubiod(int l, int b, int h){
        int area = l*b*h;
        return area;
    }

    public static float AreaOfCylinder(int r, int h){
        float area = 3.14f*r*r*h;
        return area;
    }

    public static String Vowels(char a){

        String answer = "Not vowel";

        if (a == 'a'|| a=='e'|| a=='i'|| a=='o'||a=='u') {
            answer = "Vowel";
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean b = true;

        while (b) {
            
            System.out.println("Choose the option:\n\n1). Area of triangle \n2). Area of Circle \n3).Area of Cube \n4). Area of Cuboid \n5).Area of Cylinder \n6). Find Vowel or not\n7). Exit \n\n Enter number 1,2,3,4,5,6,7 : \n---------------------------------------------------");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("------------------Area of triangle------------------------");
                    System.err.print("Enter Base: ");
                    int base = sc.nextInt();
                    System.err.print("Enter Height: ");
                    int height = sc.nextInt();
                
                    float areaOfTriangle = AreaOfTriangle(base, height);
                
                    System.out.println("Area of Triangle is : "+areaOfTriangle);
                    System.out.println("--------------------------------------------------------------\n");
                
                    break;
            
                case 2:
                    System.out.println("------------------Area of Circle------------------------");
                    System.err.print("Enter Radius: ");
                    int radius = sc.nextInt();

                    float areaOfCircle = AreaOfCircle(radius);

                    System.out.println("Area of Circle is : "+areaOfCircle);
                    System.out.println("--------------------------------------------------------------\n");
                    break;
            
                case 3: 
                   
                    System.out.println("------------------Area of Cube------------------------");
                    System.err.print("Enter Length: ");
                    int len = sc.nextInt();

                    int areaOfCube = AreaOfCube(len);

                    System.out.println("Area of Cube is : "+areaOfCube);
                    System.out.println("--------------------------------------------------------------\n");
                    break;

                case 4:

                    System.out.println("------------------Area of Cuboid------------------------");
                    System.err.print("Enter Length: ");
                    int Clength = sc.nextInt();
                    System.err.print("Enter Height: ");
                    int Cheight = sc.nextInt();
                    System.err.print("Enter Base: ");
                    int Cbase = sc.nextInt();

                    int areaOfCuboid = AreaOfCubiod(Clength, Cbase, Cheight);

                    System.out.println("Area of Cuboid is : "+areaOfCuboid);
                    System.out.println("--------------------------------------------------------------\n");
                    break;
            
                case 5:
                    System.out.println("------------------Area of Cylinder------------------------");
                    System.err.print("Enter Radius: ");
                    int Cyradius = sc.nextInt();
                    System.err.print("Enter Height: ");
                    int Cyheight = sc.nextInt();

                    float areaOfCylinder = AreaOfCylinder(Cyradius, Cyheight);

                    System.out.println("Area of Cuboid is : "+areaOfCylinder);
                    System.out.println("--------------------------------------------------------------\n");
                    break;

                case 6:
                
                    System.out.println("------------------Find Vowel or not------------------------");
                    System.err.print("Enter Character: ");
                    char CharVal = sc.next().charAt(0);

                    String vlowelOrNot = Vowels(CharVal);

                    System.out.println(CharVal+" is "+vlowelOrNot);
                    System.out.println("--------------------------------------------------------------\n");
                    break;

                case 7:
                    b = false;
                    break;

                default:
                    System.out.println("Invalid number");
                    break;
            
            }

        }

        sc.close();
    }
}
