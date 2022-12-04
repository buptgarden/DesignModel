package com.garden.app;

import com.garden.build.factories.GUIFactory;
import com.garden.common.buttons.Button;
import com.garden.common.checkboxs.CheckBox;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
