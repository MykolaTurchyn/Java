public class Car {
    int id;
    String model;
    Driver driver;

    public Car() {
    }

    public Car(int id, String model, Driver driver) {
        this.id = id;
        this.model = model;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

