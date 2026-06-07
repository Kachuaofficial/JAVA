
interface Vehicle {

    default void start() {
        System.out.println("Vehicle started");

    }


    void accelerate();

    default void stop(){
        System.out.println("vehicle stopped");
    }
}


class Car implements Vehicle {

    
    @Override
    public void start() {
        System.out.println("vehicle is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("car is accelarate");
    }
    
    @Override
    public void stop() {
        System.out.println("stop the car");
    }
}
public class interfaceing {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.accelerate();
        c.stop();
    }
    
}
