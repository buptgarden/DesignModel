package com.garden.build.factory;

import com.garden.common.Button;

public abstract class Dialog {

    public void renderWindow(){
        // some codes render window
        // create button
        Button button = createButton();
        button.render();
    }
    abstract Button createButton();
}
