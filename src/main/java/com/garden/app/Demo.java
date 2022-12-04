package com.garden.app;

import com.garden.build.factories.GUIFactory;
import com.garden.build.factories.MacGUIFactory;
import com.garden.build.factories.WindowsGUIFactory;

import java.util.Locale;

public class Demo {

    static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        System.out.println(osName);
        if (osName.contains("mac")){
            factory = new MacGUIFactory();
        }else {
            factory = new WindowsGUIFactory();
        }

        app = new Application(factory);
        return app;
    }


    public static void main(String[] args){
        Application application = configureApplication();
        application.paint();
    }
}
