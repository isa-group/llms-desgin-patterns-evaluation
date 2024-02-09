package run1;

import original.CPU;
import original.Computer;
import original.GraphicsCard;
import original.MotherBoard;
import original.RamMemoryCard;
import original.StorageSystem;

public class ComputerBuilder {
    // Required parameters
    private MotherBoard motherBoard;
    private CPU processor;
    private StorageSystem storage;
    private RamMemoryCard[] ram;
    private GraphicsCard graphicsCard;

    // Optional parameters with default values
    private boolean isGraphicsCardEnabled = false;
    private boolean isBluetoothEnabled = false;

    public ComputerBuilder setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public ComputerBuilder setProcessor(CPU processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setStorage(StorageSystem storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setRam(RamMemoryCard[] ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.setMotherBoard(this.motherBoard);
        computer.setProcessor(this.processor);
        computer.setStorage(this.storage);
        computer.setRam(this.ram);
        computer.setGraphicsCard(this.graphicsCard);
        computer.setGraphicsCardEnabled(this.isGraphicsCardEnabled);
        computer.setBluetoothEnabled(this.isBluetoothEnabled);
        return computer;
    }
}

