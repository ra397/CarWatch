public class Car {
    private String model;
    private String make;
    private int year;
    private int currentMileage;

    public Car(String model, String make, int year, int currentMileage) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.currentMileage = currentMileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(int currentMileage) {
        this.currentMileage = currentMileage;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}