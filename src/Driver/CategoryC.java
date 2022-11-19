package Driver;

import Transport.Car;
import Transport.Freight;

public class CategoryC implements DriverLicence{

    @Override
    public boolean canDrive(Car car) {
        return car.getClass() == Freight.class;
    }
}
