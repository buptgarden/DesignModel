package com.garden.abstractFactory;

import com.garden.abstractFactory.buttons.Button;
import com.garden.abstractFactory.checkboxes.Checkbox;
import com.garden.abstractFactory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.pain();
    }
}
