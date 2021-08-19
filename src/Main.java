//Делегувати до PC можливість зміни всіх характеристик складових частин
//        (приклад:PC повинен мати методи які змінюють volume в Ram,frequency в CPU і тд)


public class Main {
    public static void main(String[] args) {

        CPU cpu1 = new CPU("Intel", 3, 5, "Samsung");
        Motherboad motherboarder1 = new Motherboad("PC-2244", "Microsoft");
        HardDrive hard1 = new HardDrive("Samsung", 3, Type.SSD);
        Ram ram1 = new Ram(1, "Good Ram", "DDR2", 3);
        PC pc1 = new PC("Hp", cpu1, motherboarder1, ram1, hard1);


        // // // change data in ram(volume)
        pc1.getRam().setVolume(5);
        System.out.println(pc1);
    }
}
