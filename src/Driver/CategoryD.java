package Driver;

import Transport.Bus;
import Transport.Car;

public class CategoryD implements DriverLicence {
    @Override
    public boolean canDrive(Car car) {
        return car.getClass() == Bus.class;
    }
}
