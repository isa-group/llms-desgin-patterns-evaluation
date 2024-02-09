package run2;

import original.CPU;
import original.Computer;
import original.GraphicsCard;
import original.MotherBoard;
import original.RamMemoryCard;
import original.StorageSystem;

public interface ComputerBuilder {
    ComputerBuilder setMotherBoard(MotherBoard motherBoard);
    ComputerBuilder setProcessor(CPU processor);
    ComputerBuilder setStorage(StorageSystem storage);
    ComputerBuilder setRam(RamMemoryCard[] ram);
    ComputerBuilder setGraphicsCard(GraphicsCard graphicsCard);
    ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled);
    ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled);
    Computer build();
}
