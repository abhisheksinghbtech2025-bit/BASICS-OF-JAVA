/*
 * Assignment No: 11
 * Program 2: Switchable Interface
 *
 * Aim:
 * To demonstrate interface implementation
 * using Light and Fan classes.
 */

// Interface
interface Switchable {

    /*
     * Abstract method.
     * Every implementing class
     * must define this method.
     */
    void turnOn();
}

// Light Class implementing Switchable
class Light implements Switchable {

    // Data member
    String room;

    // Constructor
    Light(String room) {

        this.room = room;
    }

    // Implementation of interface method
    @Override
    public void turnOn() {

        System.out.println("------ Light Status ------");
        System.out.println("Room   : " + room);
        System.out.println("Status : Light Turned ON");
    }
}

// Fan Class implementing Switchable
class Fan implements Switchable {

    // Data member
    int speed;

    // Constructor
    Fan(int speed) {

        this.speed = speed;
    }

    // Implementation of interface method
    @Override
    public void turnOn() {

        System.out.println("------ Fan Status ------");
        System.out.println("Fan Speed : " + speed);
        System.out.println("Status    : Fan Turned ON");
    }
}

// Main Class
public class SwitchableDemo {

    public static void main(String[] args) {

        // Creating objects using interface reference
        Switchable light = new Light("Living Room");

        Switchable fan = new Fan(5);

        // Calling interface methods
        light.turnOn();

        System.out.println();

        fan.turnOn();
    }
}