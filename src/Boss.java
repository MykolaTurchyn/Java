public class Boss implements Printable {
    private String name;
    private int age;

    public Boss() {
    }

    public Boss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void print() {
        System.out.println("hello i am boos and i am " + this.age + "and my name is " + this.name);
    }
}
