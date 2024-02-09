package run2;

import original.CPU;
import original.Computer;
import original.GraphicsCard;
import original.MemoryUnit;
import original.MotherBoard;
import original.RamMemoryCard;
import original.StorageSystem;
import original.StorageSystemType;

public class ComputerBuilderImpl implements ComputerBuilder {
    private Computer computer;

    public ComputerBuilderImpl() {
        this.computer = new Computer();
    }

    public ComputerBuilder setMotherBoard(MotherBoard motherBoard) {
        computer.setMotherBoard(motherBoard);
        return this;
    }

    public ComputerBuilder setProcessor(CPU processor) {
        computer.setProcessor(processor);
        return this;
    }

    public ComputerBuilder setStorage(StorageSystem storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder setRam(RamMemoryCard[] ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setGraphicsCard(GraphicsCard graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        computer.setGraphicsCardEnabled(isGraphicsCardEnabled);
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        computer.setBluetoothEnabled(isBluetoothEnabled);
        return this;
    }

    public Computer build() {
        return computer;
    }
}


