package de.reuter.patterns.builder.builders;

import de.reuter.patterns.builder.cars.CarType;
import de.reuter.patterns.builder.components.Engine;
import de.reuter.patterns.builder.components.GPSNavigator;
import de.reuter.patterns.builder.components.Transmission;
import de.reuter.patterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
