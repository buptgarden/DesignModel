package com.garden.build.builders;

import com.garden.common.cars.CarType;
import com.garden.common.components.Engine;
import com.garden.common.components.GPSNavigator;
import com.garden.common.components.Transmission;
import com.garden.common.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
