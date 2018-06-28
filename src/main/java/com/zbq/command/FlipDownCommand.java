package com.zbq.command;

/**
 * ConcreteCommand
 * 具体命令类
 */
public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}