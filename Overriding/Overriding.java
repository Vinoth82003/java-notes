class Vehicle{
    public void move(){
        System.out.println("Vehicle moving");
    }
}

class Truck extends Vehicle{
    @Override
    public void move(){
        System.out.println("Truck is moving");
    }
}

class Cycle extends Vehicle{
    @Override
    public void move()
    {
        System.out.println("Cycle is moving");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Vehicle v ; // Generalized Reference
        v = new Truck(); //Cycle  Up-casted to parent (Vehicle)
        v.move();
        v = new Cycle(); //Cycle  Up-casted to parent (Vehicle)
        v.move();
    }
}
