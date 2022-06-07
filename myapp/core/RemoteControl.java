package myapp.core;

public class RemoteControl {
    
    private Controllable control;

    public RemoteControl(Controllable c){
        this.control = c;
    }
    
    // Since we used to the Controllable interface hence the start stop method should be made here 
    public void start() {
        this.control.start();
    }

    public void stop() {
        this.control.stop();
    }
}
