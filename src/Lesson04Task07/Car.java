package Lesson04Task07;

public class Car extends Vehicle {

    protected String name;
    protected String size;
    protected String carMark;
    protected String carModel;
    protected int currentGear;
    protected int numderOfGears;
    protected int enginePower;
//    protected boolean ignitionOn;
    protected int currentVelocity;
    protected int currentDirection;


    public Car() {
        super("car", "medium");
        this.numderOfGears = 4;
        this.enginePower = 85;
        //System.out.println("Car#0");
    }

    public Car(String name, String size) {
        super(name, size);
        //System.out.println("Car#2");
    }

    public void stop(){
        this.currentVelocity = 0;
        this.currentGear = 0;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void gearUp(){
        if( this.currentGear <= this.numderOfGears){
            this.currentGear++;
            this.currentVelocity += (15 + enginePower/10);
            System.out.println("You are driving ahead in gear " + this.currentGear);
        } else {
            System.out.println("You are driving at top speed. Gear: " + this.currentGear);
        }
    }

    public void gearDown(){
        if( this.currentGear > 0){
            this.currentGear--;
            this.currentVelocity -= (15 + enginePower/10);
            System.out.println("You are driving ahead. Gear: " + this.currentGear);
        } else {
            System.out.println("You are driving astern");
        }
    }

    @Override
    public void steer(int direction) {
        //lets improve steering!
        this.currentDirection += direction;
        while(this.currentDirection > 359){
            this.currentDirection -= 360;
        }
        while (this.currentDirection < 0){
            this.currentDirection += 360;
        }
        System.out.println("Direction: " + currentDirection + " degrees.");
    }

    public void lookAtDashboard(){
        System.out.println("Gear: " + currentGear + ", Speed: " + currentVelocity + ", Direction: " + currentDirection);
    }

    @Override
    public int getCurrentDirection() {
        return currentDirection;
    }

    @Override
    public int getCurrentVelocity() {
        return currentVelocity;
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    public int getNumderOfGears() {
        return numderOfGears;
    }
}
