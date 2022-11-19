package Driver;

import Transport.Car;
import Transport.Freight;
import Transport.Passenger;
import com.sun.jdi.connect.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Car> cars = new ArrayDeque<>();

    private void add(Car car) {
        cars.offer(car);
    }

    public void addPassenger(Passenger passenger) {
        add(passenger);
    }

    public void addFreight(Freight freight) {
        add(freight);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();
            boolean result = car.diagnostic();
            if (!result) {
                car.repair();
            }
        }
    }
}
