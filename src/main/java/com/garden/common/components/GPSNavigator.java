package com.garden.common.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator(){
        this.route = "221b, Baker Street ,London to xxxx";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }

}
