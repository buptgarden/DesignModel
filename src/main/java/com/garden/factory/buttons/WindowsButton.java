package com.garden.factory.buttons;

public class WindowsButton implements Button{


    @Override
    public void render() {
        System.out.println("Windows button!");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows button, say hello - 'Hello World!'");
    }
}
