package com.garden.abstractFactory.factories;

import com.garden.abstractFactory.buttons.Button;
import com.garden.abstractFactory.buttons.WindowsButton;
import com.garden.abstractFactory.checkboxes.Checkbox;
import com.garden.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
