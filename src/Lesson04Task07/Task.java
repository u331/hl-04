package Lesson04Task07;

//7. Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
//    Finally, create another class, a specific type of Car that inherits from the Car class.
//    You should be able to hand steering, changing gears, and moving(speed in other words).
//    You will want to decide where to put the appropriate state and behaviours(fields and methods).
//    As mentioned above, changing gears, increasing/decreasing speed should be included.
//    For you specific type of vehicle you will want to add something specific for that type of car.

public class Task {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.steer(20);
        System.out.println( c1.getCurrentDirection() );

        SportCar sc1 = new SportCar("f1", "large");
        sc1.gearUp();
        sc1.lookAtDashboard();
        sc1.gearDown();
        sc1.lookAtDashboard();


    }

}
