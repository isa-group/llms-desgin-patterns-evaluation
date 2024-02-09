package run2;

import original.CPU;
import original.Computer;
import original.GraphicsCard;
import original.MemoryUnit;
import original.RamMemoryCard;
import original.StorageSystem;
import original.StorageSystemType;

public class ComputerDirector {
    public Computer buildGamingComputer(ComputerBuilder builder) {
        // Example of building a specific type of computer
        return builder.setProcessor(new CPU("AMD", "Ryzen 9", 3.8, 12, 24))
                      .setGraphicsCard(new GraphicsCard(8, 1.5, "NVIDIA", "RTX 3080"))
                      .setRam(new RamMemoryCard[]{new RamMemoryCard(16, MemoryUnit.GB, 3.2)})
                      .setStorage(new StorageSystem(1, MemoryUnit.TB, 3.5, StorageSystemType.SSD, "Samsung", "EVO 970"))
                      .setGraphicsCardEnabled(true)
                      .setBluetoothEnabled(true)
                      .build();
    }
}
