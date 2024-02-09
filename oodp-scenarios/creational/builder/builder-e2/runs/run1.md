# Builder Scenario 2:

## Run data:

URL: https://chat.openai.com/share/09295239-e8f6-44c1-9309-5e53d28f593f

## Execution

### USER:

Given the following classes: 
```java
public class Computer {
	
	//required parameters
    private MotherBoard motherBoard;
	private CPU processor;
    private StorageSystem storage;
	private RamMemoryCard[] ram;
    private GraphicsCard graphicsCard;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
    
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
    public CPU getProcessor() {
        return processor;
    }
    public void setProcessor(CPU processor) {
        this.processor = processor;
    }
    public StorageSystem getStorage() {
        return storage;
    }
    public void setStorage(StorageSystem storage) {
        this.storage = storage;
    }
    public RamMemoryCard[] getRam() {
        return ram;
    }
    public void setRam(RamMemoryCard[] ram) {
        this.ram = ram;
    }
    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
    public void setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
    }
	
    @Override
    public String toString() {
        return "Computer [motherBoard=" + motherBoard + ", processor=" + processor + ", storage=" + storage + ", ram="
                + ram + ", graphicsCard=" + graphicsCard + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }		

}

public class CPU {
    String brand;
    String model;
    double speed;
    int cores;
    int threads;

    public CPU(String brand, String model, double speed, int cores, int threads) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.cores = cores;
        this.threads = threads;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String toString() {
        return "CPU: " + brand + " " + model + " " + speed + "GHz " + cores + "Cores " + threads + "Threads";
    }

}

public class GraphicsCard {
    public double capacity;
    public MemoryUnit unit;
    public double speed;
    public String brand;
    public String model;    

    public GraphicsCard(double capacity, double speed, String brand, String model) {
        this.capacity = capacity;
        this.unit = MemoryUnit.GB;
        this.speed = speed;
        this.brand = brand;
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public MemoryUnit getUnit() {
        return unit;
    }

    public void setUnit(MemoryUnit unit) {
        this.unit = unit;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
     
    public String toString() {
        return "Graphics Card: " + brand + " " + model + " " + capacity + unit + speed + "GHz";
    }
}


public enum MemoryUnit {
    MB(1), GB(1024), TB(1024 * 1024);    
    private int multiplier;
    MemoryUnit(int multiplier) { this.multiplier = multiplier;  }
    public int getMultiplier() { return multiplier; }    
}

public class MotherBoard {
    public String brand;
    public String model;
    public String chipset;
    public String socket;
    public String formFactor;
    public String memoryType;
    public int memorySlots;
    public int maxMemory;
    public int memorySpeed;
    public int sataPorts;
    public int m2Slots;
    public int usb2Ports;
    public int usb3Ports;
    public int usb31Ports;
    public int usbCPorts;
    public int ethernetPorts;
    public int audioPorts;
    public int videoPorts;
    public int pciSlots;
    public int pcieSlots;
    public int sliCrossfireSlots;
    public int raidSupport;
    public int wifiSupport;
    public int bluetoothSupport;
    public int rgbSupport;    
    
    public MotherBoard(String brand, String model, String chipset, String socket, String formFactor, String memoryType, int memorySlots, int maxMemory, int memorySpeed, int sataPorts, int m2Slots, int usb2Ports, int usb3Ports, int usb31Ports, int usbCPorts, int ethernetPorts, int audioPorts, int videoPorts, int pciSlots, int pcieSlots, int sliCrossfireSlots, int raidSupport, int wifiSupport, int bluetoothSupport, int rgbSupport, int price) {
        this.brand = brand;
        this.model = model;
        this.chipset = chipset;
        this.socket = socket;
        this.formFactor = formFactor;
        this.memoryType = memoryType;
        this.memorySlots = memorySlots;
        this.maxMemory = maxMemory;
        this.memorySpeed = memorySpeed;
        this.sataPorts = sataPorts;
        this.m2Slots = m2Slots;
        this.usb2Ports = usb2Ports;
        this.usb3Ports = usb3Ports;
        this.usb31Ports = usb31Ports;
        this.usbCPorts = usbCPorts;
        this.ethernetPorts = ethernetPorts;
        this.audioPorts = audioPorts;
        this.videoPorts = videoPorts;
        this.pciSlots = pciSlots;
        this.pcieSlots = pcieSlots;
        this.sliCrossfireSlots = sliCrossfireSlots;
        this.raidSupport = raidSupport;
        this.wifiSupport = wifiSupport;
        this.bluetoothSupport = bluetoothSupport;
        this.rgbSupport = rgbSupport;     
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }

    public int getMemorySpeed() {
        return memorySpeed;
    }

    public void setMemorySpeed(int memorySpeed) {
        this.memorySpeed = memorySpeed;
    }

    public int getSataPorts() {
        return sataPorts;
    }

    public void setSataPorts(int sataPorts) {
        this.sataPorts = sataPorts;
    }

    public int getM2Slots() {
        return m2Slots;
    }

    public void setM2Slots(int m2Slots) {
        this.m2Slots = m2Slots;
    }

    public int getUsb2Ports() {
        return usb2Ports;
    }

    public void setUsb2Ports(int usb2Ports) {
        this.usb2Ports = usb2Ports;
    }

    public int getUsb3Ports() {
        return usb3Ports;
    }

    public void setUsb3Ports(int usb3Ports) {
        this.usb3Ports = usb3Ports;
    }

    public int getUsb31Ports() {
        return usb31Ports;
    }

    public void setUsb31Ports(int usb31Ports) {
        this.usb31Ports = usb31Ports;
    }

    public int getUsbCPorts() {
        return usbCPorts;
    }

    public void setUsbCPorts(int usbCPorts) {
        this.usbCPorts = usbCPorts;
    }

    public int getEthernetPorts() {
        return ethernetPorts;
    }

    public void setEthernetPorts(int ethernetPorts) {
        this.ethernetPorts = ethernetPorts;
    }

    public int getAudioPorts() {
        return audioPorts;
    }

    public void setAudioPorts(int audioPorts) {
        this.audioPorts = audioPorts;
    }

    public int getVideoPorts() {
        return videoPorts;
    }

    public void setVideoPorts(int videoPorts) {
        this.videoPorts = videoPorts;
    }

    public int getPciSlots() {
        return pciSlots;
    }

    public void setPciSlots(int pciSlots) {
        this.pciSlots = pciSlots;
    }

    public int getPcieSlots() {
        return pcieSlots;
    }

    public void setPcieSlots(int pcieSlots) {
        this.pcieSlots = pcieSlots;
    }

    public int getSliCrossfireSlots() {
        return sliCrossfireSlots;
    }

    public void setSliCrossfireSlots(int sliCrossfireSlots) {
        this.sliCrossfireSlots = sliCrossfireSlots;
    }

    public int getRaidSupport() {
        return raidSupport;
    }

    public void setRaidSupport(int raidSupport) {
        this.raidSupport = raidSupport;
    }

    public int getWifiSupport() {
        return wifiSupport;
    }

    public void setWifiSupport(int wifiSupport) {
        this.wifiSupport = wifiSupport;
    }

    public int getBluetoothSupport() {
        return bluetoothSupport;
    }

    public void setBluetoothSupport(int bluetoothSupport) {
        this.bluetoothSupport = bluetoothSupport;
    }

    public int getRgbSupport() {
        return rgbSupport;
    }

    public void setRgbSupport(int rgbSupport) {
        this.rgbSupport = rgbSupport;
    }

    public String toString() {
        return "MotherBoard: " + brand + " " + model + " " + chipset + " " + socket + " " + formFactor + " " + memoryType + " " + memorySlots + " " + maxMemory + " " + memorySpeed + " " + sataPorts + " " + m2Slots + " " + usb2Ports + " " + usb3Ports + " " + usb31Ports + " " + usbCPorts + " " + ethernetPorts + " " + audioPorts + " " + videoPorts + " " + pciSlots + " " + pcieSlots + " " + sliCrossfireSlots + " " + raidSupport + " " + wifiSupport + " " + bluetoothSupport + " " + rgbSupport;
    }
    
}

public class RamMemoryCard {
    public double capacity;
    public MemoryUnit unit;
    public double speed;

    public RamMemoryCard(double capacity, MemoryUnit unit, double speed) {
        this.capacity = capacity;
        this.unit = unit;
        this.speed = speed;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public MemoryUnit getUnit() {
        return unit;
    }

    public void setUnit(MemoryUnit unit) {
        this.unit = unit;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
}

public class StorageSystem {
    double capacity;
    MemoryUnit unit;
    double speed;
    StorageSystemType type;
    String brand;
    String model;
    
    public StorageSystem(double capacity, MemoryUnit unit, double speed, StorageSystemType type, String brand, String model) {
        this.capacity = capacity;
        this.unit = unit;
        this.speed = speed;
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public MemoryUnit getUnit() {
        return unit;
    }

    public void setUnit(MemoryUnit unit) {
        this.unit = unit;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public StorageSystemType getType() {
        return type;
    }

    public void setType(StorageSystemType type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "StorageSystem: " + brand + " " + model + " " + capacity + " " + unit + " " + speed + "GB/s " + type;
    }   

}

public enum StorageSystemType {
    HDD, SSD;
}

```
How would you implement the capability of creating different models of computers?

### ChatGPT

To implement the capability of creating different models of computers using the provided classes, you can use the Builder pattern. The Builder pattern is a design pattern that allows for the construction of complex objects step by step. It's especially useful when an object has many parameters, some of which may be optional. This pattern helps to maintain the immutability of the objects once they are constructed and makes the object creation process more clear and flexible.

Here's how you could implement a Builder for the `Computer` class:

```java
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
```

This `ComputerBuilder` class allows clients to build different models of computers by chaining method calls to set up the configuration they want and finally calling `build()` to create an instance of `Computer`.

Example usage:

```java
Computer gamingPC = new ComputerBuilder()
                        .setProcessor(new CPU("AMD", "Ryzen 9 5900X", 3.7, 12, 24))
                        .setMotherBoard(new MotherBoard("ASUS", "ROG Strix X570-E", "X570", "AM4", "ATX", "DDR4", 4, 128, 3600, 8, 2, 4, 8, 2, 2, 1, 3, 5, 2, 3, 1, 1, 1, 1))
                        .setRam(new RamMemoryCard[]{new RamMemoryCard(16, MemoryUnit.GB, 3200), new RamMemoryCard(16, MemoryUnit.GB, 3200)})
                        .setStorage(new StorageSystem(1, MemoryUnit.TB, 5500, StorageSystemType.SSD, "Samsung", "970 EVO Plus"))
                        .setGraphicsCard(new GraphicsCard(8, 1.8, "NVIDIA", "RTX 3080"))
                        .setGraphicsCardEnabled(true)
                        .setBluetoothEnabled(true)
                        .build();
```

This example creates a high-end gaming PC configuration using the `ComputerBuilder`. The Builder pattern makes it easy to add or remove components from the computer configuration without changing the `Computer` class or constructors.

### User

Provide a complete usage example with pretty console output

### ChatGPT

To provide a complete example of using the `ComputerBuilder` to create a computer and then displaying its configuration in a pretty console output, let's first assume you have the `ComputerBuilder` class implemented as I described previously.

Now, let's write a `Main` class that uses the `ComputerBuilder` to create a computer instance and then prints its configuration details in a formatted manner.

### Main.java

```java
public class Main {
    public static void main(String[] args) {
        // Create a computer using the ComputerBuilder
        Computer gamingPC = new ComputerBuilder()
                                .setProcessor(new CPU("AMD", "Ryzen 9 5900X", 3.7, 12, 24))
                                .setMotherBoard(new MotherBoard("ASUS", "ROG Strix X570-E", "X570", "AM4", "ATX", "DDR4", 4, 128, 3600, 8, 2, 4, 8, 2, 2, 1, 3, 5, 2, 3, 1, 1, 1, 1))
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
```

This `Main` class demonstrates creating a `Computer` object with specific components and then pretty printing its configuration to the console. The `printComputerConfiguration` method iterates through the RAM slots to print each RAM module's details and checks if the graphics card and Bluetooth are enabled to print their status accordingly.

### Sample Console Output

```
Computer Configuration:
-----------------------
Processor: CPU: AMD Ryzen 9 5900X 3.7GHz 12Cores 24Threads
Motherboard: MotherBoard: ASUS ROG Strix X570-E X570 AM4 ATX DDR4 4 128 3600 8 2 4 8 2 2 1 3 5 2 3 1 1 1 1
RAM: 
 - RamMemoryCard: 16GB 3200.0GHz
 - RamMemoryCard: 16GB 3200.0GHz
Storage: StorageSystem: Samsung 970 EVO Plus 1.0 TB 5500GB/s SSD
Graphics Card: Graphics Card: NVIDIA RTX 3080 8.0GB 1.8GHz
Bluetooth: Enabled
```

This output clearly shows the computer's configuration, making it easy for someone to understand what components the computer has, including details about the processor, motherboard, RAM, storage, graphics card, and Bluetooth capability.

## Evaluation and Discussion

In this case we have specified the need of creating different models of computers. The LLM identified the opportunity of applying the design pattern proactively and suggested a correct implementation. When we requested a complete and functional example using the Builder, it generated an implementation that coanined a trivial bug, just adding a parameter to the mother board constructor the example worked.



