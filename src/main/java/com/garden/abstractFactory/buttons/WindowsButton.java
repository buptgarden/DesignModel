package com.garden.abstractFactory.buttons;

public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("You have create WindowsButton");
    }
}
