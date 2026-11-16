import java.awt.*;

public abstract class Car implements Movable  {
    protected int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    public String modelName; // The car model name

    protected int x;
    protected int y;
    protected String direction = "UP";

    public int getNrDoors() {
        return nrDoors;
    }
    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public abstract double speedFactor();

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    @Override
    public void move(){
        if (direction.equals("up")){
            y = (int) (y + currentSpeed);
        }
        if(direction.equals("down")){
            y = (int) (y - currentSpeed);
        }
        if (direction.equals("left")){
            x = (int) (x - currentSpeed);
        }
        if(direction.equals("right")){
            x = (int) (x + currentSpeed);
        }
    }

    @Override
    public void turnLeft() {
        if(direction.equals("up")){
            direction = "left";
        }
        else if (direction.equals("left")) {
            direction= " Down";
        }
        else if (direction.equals("Down")) {
            direction= " Right";
        }
        else
            direction = "Up";
    }
    @Override
    public void turnRight(){
        if(direction.equals("up")){
            direction = " right";
        }
        else if (direction.equals("right")){
            direction= "down";
        }
        else if (direction.equals("down")){
            direction= "left";
        }
        else
            direction = "Up";
    }
}
