package com.garden.factory.factory;

import com.garden.factory.buttons.Button;
import com.garden.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    public Button createButton(){
        return new HtmlButton();
    }
}
