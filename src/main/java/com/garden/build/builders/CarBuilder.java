package com.garden.build.builders;

import com.garden.common.cars.Car;
import com.garden.common.cars.CarType;
import com.garden.common.components.Engine;
import com.garden.common.components.GPSNavigator;
import com.garden.common.components.Transmission;
import com.garden.common.components.TripComputer;


public class CarBuilder implements Builder{

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType carType){
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer){
        this.tripComputer = tripComputer;
    }
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
