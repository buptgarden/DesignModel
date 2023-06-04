package com.garden.factory.factory;

import com.garden.factory.buttons.Button;
import com.garden.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
