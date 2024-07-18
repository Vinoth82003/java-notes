package InstanceOf;

import java.util.Scanner;

class Ball{
    private double radius;
    Ball(){

    }
    Ball(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class BasketBall extends Ball{
    String color ;
    double price;

    BasketBall(){

    }

    BasketBall(double radius , String color, double price){
        super(radius);
        this.color = color;
        this.price = price;
    }
}

class TennisBall extends Ball{
    String color ;
    double price;

    TennisBall(){

    }

    TennisBall(double radius , String color, double price){
        super(radius);
        this.color = color;
        this.price = price;
    }
}

class Bag{
    Ball ball;

    public void addBall(Ball ball){
        if (this.ball == null) {
            this.ball = ball;
            System.out.println("\nBall added successfully...!\n");
        }else{
            System.out.println("\nThere is already one ball\n");
        }
    }

    public void removeBall(){
        if (this.ball == null) {
            System.out.println("\nBall is already empty....!\n");
        }else{
            this.ball = null;
            System.out.println("\nBall removed successfully....!\n");
        }
    }

    public void isBagEmpty(){
        if (this.ball != null) {
            System.out.println("\nBag is Not empty....!\n");
        }else{
            System.out.println("\nBag is  empty....!\n");
        }
    }

    public void whatGame(){
        if (this.ball != null) {
            if (this.ball instanceof BasketBall) {
                System.out.println("The game is BasketBall game");
                BasketBall basketBall = (BasketBall)ball;
                System.out.println("Radius: "+basketBall.getRadius());
                System.out.println("Color: "+basketBall.color);
                System.out.println("Price: "+basketBall.price);
            }else{
                System.out.println("The game is Tennis game");
                TennisBall tennisBall = (TennisBall)ball;
                System.out.println("Radius: "+tennisBall.getRadius());
                System.out.println("Color: "+tennisBall.color);
                System.out.println("Price: "+tennisBall.price);
            }
        }else{
            System.out.println("You cannot play with any ball..:(");
        }
    }
}

public class BallBag {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Bag bag = new Bag();
        boolean loop = true;   
        while (loop) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Select option: ");
            System.out.println("1.Add Ball\n2.Remove Ball\n3.check bag empty\n4.check game\n5.Exit");
            System.out.println("------------------------------------------------------------");
            int ch = inp.nextInt();
            switch (ch) {
            case 1:
                System.out.println("\tEnter what ball to add...\n\t1.Basket Ball\n\t2.Tennis Ball\n\t3.Exit");
                int inCh = inp.nextInt();
                switch (inCh) {
                    case 1:
                        System.out.print("\tEnter Radius of Basket Ball: " );
                        double radius = inp.nextDouble();
                        System.out.print("\tEnter Color of Basket Ball: " );
                        String color = inp.next();
                        System.out.print("\tEnter Price of Basket Ball: " );
                        double price = inp.nextDouble();
                        BasketBall bb = new BasketBall(radius, color, price);
                        bag.addBall(bb);
                        break;
                    case 2:
                        System.out.print("\tEnter Radius of Tennis Ball: " );
                        double Tradius = inp.nextDouble();
                        System.out.print("\tEnter Color of Basket Ball: " );
                        String Tcolor = inp.next();
                        System.out.print("\tEnter Price of Basket Ball: " );
                        double Tprice = inp.nextDouble();
                        TennisBall Tennis = new TennisBall(Tradius, Tcolor, Tprice);
                        bag.addBall(Tennis);
                        break;
                    case 3:
                        System.out.println("\nExiting the add ball\n");
                        inCh = 0;
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                bag.removeBall();
                break;
            case 3:
                bag.isBagEmpty();
                break;
            case 4:
                bag.whatGame();
                break;
            case 5:
                loop = false;
                break;
            default:
                break;
        }
    } 
 }
}
