package Transport;

public class Bus extends Car implements Competing {

    private Capacity capacity;
    public double[] timeOfLap;
    public int bestSpeed;

    public Bus(String brand, String model, double engine, double[] timeOfLap, int bestSpeed, Capacity capacity) {
        super(brand, model, engine);
        this.timeOfLap = timeOfLap;
        this.capacity = capacity;
        if (bestSpeed <= 0) {
            this.bestSpeed = bestSpeed;
        } else {
            this.bestSpeed = bestSpeed;
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public double[] getTimeOfLap() {
        return timeOfLap;
    }

    public int getBestSpeed() {
        return bestSpeed;
    }

    @Override
    public void pitStop() {
        System.out.println("Отправиться на пит-стоп");
    }

    @Override
    public void bestTimeOfLap() {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < timeOfLap.length; i++) {
            if (timeOfLap[i] < min) {
                min = timeOfLap[i];
            }
        }
        System.out.println("Лучшее время круга составило: " + min);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость составила: " + bestSpeed);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Внестимость автобуса: от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public boolean diagnostic() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");
    }
}
