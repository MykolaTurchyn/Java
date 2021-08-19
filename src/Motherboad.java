public class Motherboad {
    String model;
    String producer;

    public Motherboad() {
    }

    public Motherboad(String model, String producer) {
        this.model = model;
        this.producer = producer;

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


    @Override
    public String toString() {
        return "Motherboad{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
