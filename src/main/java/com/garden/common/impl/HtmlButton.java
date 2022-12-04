package com.garden.common.impl;

import com.garden.common.Button;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("render html button");
        onClick();
    }


    public void onClick(){
        System.out.println("Click! Buttons says - 'Hello World' !");
    }
}
