package Driver;

import Transport.Car;
public class Driver<L extends DriverLicence> {

    protected String fullName;
    protected L grade;
    protected int experience;

    public Driver(String fullName, L grade, int experience) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Не указано";
        } else {
            this.fullName = fullName;
        }
        setGrade(grade);
        setExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public L getGrade() {
        return grade;
    }

    public void setGrade(L grade) {
        if (grade == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.grade = grade;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else if (experience == 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }

    public void startDriving(Car car) {
        if (grade.canDrive(car)) {
            car.startMoving();
        } else {
            System.out.println("Нет соответствующей категории");
        }
    }

    public void stopDriving(Car car) {
        if (grade.canDrive(car)) {
            car.stopMoving();
        } else {
            System.out.println("Нет соответствующей категории");
        }
    }

    public void refuel() {
        System.out.println("Водитель заправил авто");
    }

    @Override
    public String toString() {
        return fullName + ", стаж вождения: " + getExperience() + " лет";
    }
}
