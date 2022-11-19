package Transport;

public class Passenger extends Car implements Competing {

    public double[] timeOfLap;
    public int bestSpeed;
    private Carcase carcase;

    public Passenger(String brand, String model, double engine, double[] timeOfLap, int bestSpeed, Carcase carcase) {
        super(brand, model, engine);
        this.timeOfLap = timeOfLap;
        this.carcase = carcase;
        if (bestSpeed <= 0) {
            this.bestSpeed = bestSpeed;
        } else {
            this.bestSpeed = bestSpeed;
        }

    }

    public Carcase getCarcase() {
        return carcase;
    }

    public void setCarcase(Carcase carcase) {
        this.carcase = carcase;
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
        if (carcase == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова: " + carcase);
        }
    }

    @Override
    public boolean diagnostic() {
        return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");
    }
}
