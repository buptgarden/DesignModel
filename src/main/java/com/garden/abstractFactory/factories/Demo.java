package com.garden.abstractFactory.factories;

import com.garden.abstractFactory.Application;

import java.util.Locale;

public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication(){
        Application app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (osName.contains("mac")){
            guiFactory = new MacOSFactory();
        }else {
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);
        return app;
    }
}
