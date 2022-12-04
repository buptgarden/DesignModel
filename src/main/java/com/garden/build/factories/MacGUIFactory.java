package com.garden.build.factories;

import com.garden.common.buttons.Button;
import com.garden.common.buttons.MacButton;
import com.garden.common.checkboxs.CheckBox;
import com.garden.common.checkboxs.MacCheckBox;

public class MacGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox(){
        return new MacCheckBox();
    }
}
