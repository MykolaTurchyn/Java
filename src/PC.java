public class PC {
    String model;
    CPU cpu;
    Motherboad motherboad;
    HardDrive hard;

    public PC() {
    }

    public PC(String model, CPU cpu, Motherboad motherboad, HardDrive hard) {
        this.model = model;
        this.cpu = cpu;
        this.motherboad = motherboad;
        this.hard = hard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Motherboad getMotherboad() {
        return motherboad;
    }

    public void setMotherboad(Motherboad motherboad) {
        this.motherboad = motherboad;
    }

    public HardDrive getHard() {
        return hard;
    }

    public void setHard(HardDrive hard) {
        this.hard = hard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", cpu=" + cpu +
                ", motherboad=" + motherboad +
                ", hard=" + hard +
                '}';
    }
}

