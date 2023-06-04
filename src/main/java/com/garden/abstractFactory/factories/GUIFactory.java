package com.garden.abstractFactory.factories;

import com.garden.abstractFactory.buttons.Button;
import com.garden.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
