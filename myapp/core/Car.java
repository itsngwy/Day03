package myapp.core;

public class Car implements Controllable {

    // Properties, instance fields. Using private to not show our variables to the public 
    private String color;
    protected String make;
    private Integer engineCapacity;
    private Boolean started = false;
    public long startedSince;

    // Default constructor
    public Car() { 
        System.out.println("*** Instantiating Car object");
        this.color = "red";
    }
    public Car(Integer capacity) {
        this.engineCapacity = capacity;
    }
    public Car(String colour, String make) {
        this.color = colour;
        this.make = make;
    }

    // Getters and Setters
    // Shortcut cmd shift p, source action, generate getters and setters
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(int capacity) {
        this.engineCapacity = capacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Boolean use isStarted instead of getStarted
    public Boolean isStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Long getDrivingDuration() {
        if (this.isStarted())
            // Convert to ms -> sec
            return (System.currentTimeMillis() - this.startedSince) / 1000;
        return (long)-1;
    }

    //Behaviour/Method
    public void start() {
        if (this.started) {
            System.out.println("Your car is running");
        } else {
            System.out.println("Vroom.....");
            this.started = true;
            // Since 0000 Jan 1 1970
            this.startedSince = System.currentTimeMillis();
        }
    }

    public void stop(){
        if (!this.started) {
            System.out.println("Your car is not running");
        } else {
            System.out.println("Splutter splutter stop.....");
            this.started = false;
        }
    }
}