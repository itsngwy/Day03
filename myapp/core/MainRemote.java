package myapp.core;

import java.rmi.Remote;

// MainRemote has Honda that is the child of Car
// A Computer that implements Controllable
// RemoteControl that has Controllable variables 

public class MainRemote {

    public static void main(String[] args) {
        
        // Uses honda class but has car attributes and methods too
        Honda h = new Honda();

        // Created a computer that implements a controllable that consists of start and stop
        Computer myNotebook = new Computer();

        // Since Car implements Controllable, it means that Honda also implements a Controllable 
        Controllable ctrl = new Honda();

        // RemoteControl did not implement Controllable but they use it as a variable hence the Controllable methods are in RemoteControl
        // rm.control = a remotecontrol to control honda object
        RemoteControl rm = new RemoteControl(h);

        // rmNotebook = a remotecontrol to control a computer object
        RemoteControl rmNotebook = new RemoteControl(myNotebook);

        rm.start();
        rmNotebook.start();

    }
}
