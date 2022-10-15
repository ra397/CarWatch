import java.util.*;

public class Profile {
    private String username;
    private String password;
    private final List<Car> userCars;

    public Profile(String username) {
        this.username = username;
        userCars = new LinkedList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Car> getUserCars() {
        return userCars;
    }

    public void addCar(Car newCar) {
        userCars.add(newCar);
    }

    public void removeCar(Car car) {
        userCars.remove(car);
    }
}
