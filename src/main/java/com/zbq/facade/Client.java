package com.zbq.facade;

/**
 * client
 */
public class Client {
    public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}
}