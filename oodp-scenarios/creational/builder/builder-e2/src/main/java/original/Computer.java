package original;

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
