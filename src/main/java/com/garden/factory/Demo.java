package com.garden.factory;

import com.garden.factory.factory.Dialog;
import com.garden.factory.factory.HtmlDialog;
import com.garden.factory.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;


    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
