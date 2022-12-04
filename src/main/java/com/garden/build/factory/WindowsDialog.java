package com.garden.build.factory;

import com.garden.common.Button;
import com.garden.common.impl.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
