package Driver;

import Transport.Car;
import Transport.Passenger;

public class CategoryB implements DriverLicence {

    @Override
    public boolean canDrive(Car car) {
        return car.getClass() == Passenger.class;
    }

}
