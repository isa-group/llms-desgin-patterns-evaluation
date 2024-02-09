package run1;

import original.CPU;
import original.Computer;
import original.GraphicsCard;
import original.MemoryUnit;
import original.MotherBoard;
import original.RamMemoryCard;
import original.StorageSystem;
import original.StorageSystemType;

public class Main2 {
     public static void main(String[] args) {
        // Create a computer using the ComputerBuilder
        Computer gamingPC = new ComputerBuilder()
                                .setProcessor(new CPU("AMD", "Ryzen 9 5900X", 3.7, 12, 24))
                                .setMotherBoard(new MotherBoard("ASUS", "ROG Strix X570-E", "X570", "AM4", "ATX", "DDR4", 4, 128, 3600, 8, 2, 4, 8, 2, 2, 1, 3, 5, 2, 3, 1, 1, 1, 1, 0, 0))
                                .setRam(new RamMemoryCard[]{new RamMemoryCard(16, MemoryUnit.GB, 3200), new RamMemoryCard(16, MemoryUnit.GB, 3200)})
                                .setStorage(new StorageSystem(1, MemoryUnit.TB, 5500, StorageSystemType.SSD, "Samsung", "970 EVO Plus"))
                                .setGraphicsCard(new GraphicsCard(8, 1.8, "NVIDIA", "RTX 3080"))
                                .setGraphicsCardEnabled(true)
                                .setBluetoothEnabled(true)
                                .build();

        // Print the computer configuration
        printComputerConfiguration(gamingPC);
    }

    private static void printComputerConfiguration(Computer computer) {
        System.out.println("Computer Configuration:");
        System.out.println("-----------------------");
        System.out.println("Processor: " + computer.getProcessor());
        System.out.println("Motherboard: " + computer.getMotherBoard());
        System.out.println("RAM: ");
        for (RamMemoryCard ram : computer.getRam()) {
            System.out.println(" - " + ram);
        }
        System.out.println("Storage: " + computer.getStorage());
        System.out.println("Graphics Card: " + (computer.isGraphicsCardEnabled() ? computer.getGraphicsCard() : "Disabled"));
        System.out.println("Bluetooth: " + (computer.isBluetoothEnabled() ? "Enabled" : "Disabled"));
    } 
}
