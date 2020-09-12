package ru.vmk.car_builder;

import ru.vmk.car_builder.cars.Manual;
import ru.vmk.car_builder.cars.Type;
import ru.vmk.car_builder.components.Engine;
import ru.vmk.car_builder.components.GPSNavigator;
import ru.vmk.car_builder.components.Transmission;
import ru.vmk.car_builder.components.TripComputer;

public class CarManualBuilder implements Builder {
        private Type type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;

        @Override
        public void setType(Type type) {
            this.type = type;
        }

        @Override
        public void setSeats(int seats) {
            this.seats = seats;
        }

        @Override
        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        @Override
        public void setTransmission(Transmission transmission) {
            this.transmission = transmission;
        }

        @Override
        public void setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
        }

        @Override
        public void setGPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
        }

        public Manual getResult() {
            return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
        }
}