package com.garden.build.factory;

import com.garden.common.Button;
import com.garden.common.impl.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
