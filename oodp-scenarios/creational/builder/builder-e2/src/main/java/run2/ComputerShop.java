package run2;

import original.Computer;

public class ComputerShop {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilderImpl();
        ComputerDirector director = new ComputerDirector();
        Computer gamingComputer = director.buildGamingComputer(builder);
        System.out.println(gamingComputer);
    }
}
