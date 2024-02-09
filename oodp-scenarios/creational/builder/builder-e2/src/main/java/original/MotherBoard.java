package original;

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
