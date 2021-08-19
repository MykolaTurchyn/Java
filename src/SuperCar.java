
public class SuperCar {
    String model;
    String producer;
    int year;
    Engine engine;

    public SuperCar() {
    }

    public SuperCar(String model, String producer, int year, Engine engine) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
