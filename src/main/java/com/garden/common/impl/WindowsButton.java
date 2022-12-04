package com.garden.common.impl;

import com.garden.common.Button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("render windows button!");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click windows button !");
    }
}
