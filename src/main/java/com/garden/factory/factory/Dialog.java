package com.garden.factory.factory;

import com.garden.factory.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){
        // 其他逻辑
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
