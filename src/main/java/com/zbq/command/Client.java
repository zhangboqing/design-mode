package com.zbq.command;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch mySwitch = new Switch();

        try {
            if ("ON".equalsIgnoreCase(args[0])) {
                mySwitch.storeAndExecute(switchUp);
            } else if ("OFF".equalsIgnoreCase(args[0])) {
                mySwitch.storeAndExecute(switchDown);
            } else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }
}
