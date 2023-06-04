package com.garden.abstractFactory.factories;

import com.garden.abstractFactory.buttons.Button;
import com.garden.abstractFactory.buttons.MacOSButton;
import com.garden.abstractFactory.checkboxes.Checkbox;
import com.garden.abstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
