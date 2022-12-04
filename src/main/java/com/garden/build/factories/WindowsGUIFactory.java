package com.garden.build.factories;

import com.garden.common.buttons.Button;
import com.garden.common.buttons.WindowsButton;
import com.garden.common.checkboxs.CheckBox;
import com.garden.common.checkboxs.MacCheckBox;
import com.garden.common.checkboxs.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
