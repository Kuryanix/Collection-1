package Transport;

public class Freight extends Car implements Competing {

    private LoadCapacity loadCapacity;
    public double[] timeOfLap;
    public int bestSpeed;

    public Freight(String brand, String model, double engine, double[] timeOfLap, int bestSpeed, LoadCapacity loadCapacity) {
        super(brand, model, engine);
        this.timeOfLap = timeOfLap;
        this.loadCapacity = loadCapacity;
        if (bestSpeed <= 0) {
            this.bestSpeed = bestSpeed;
        } else {
            this.bestSpeed = bestSpeed;
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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

    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean diagnostic() {
        return Math.random()>0.75;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");
    }
}
